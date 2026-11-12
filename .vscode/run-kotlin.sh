#!/bin/bash
set -euo pipefail

workspace="$1"
example="$2"

# Find the current example, including when a file in light/ or dark/ is open.
while [[ ! -f "$example/Main.kt" ]]; do
    if [[ "$example" == "$workspace" || "$example" == / ]]; then
        echo "실행할 예제의 Main.kt를 찾지 못했습니다." >&2
        exit 1
    fi
    example=$(dirname "$example")
done

# Compile only this example so other patterns' classes do not collide.
sources=()
while IFS= read -r -d '' file; do
    sources+=("$file")
done < <(find "$example" -type f -name '*.kt' -print0)

output=$(mktemp -d)
trap 'rm -rf "$output"' EXIT
"$workspace/.tools/kotlin-2.4.21/kotlinc/bin/kotlinc" \
    "${sources[@]}" -include-runtime -d "$output/app.jar"
java -Dfile.encoding=UTF-8 -jar "$output/app.jar"
