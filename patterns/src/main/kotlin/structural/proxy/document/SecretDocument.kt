package structural.proxy.document

class SecretDocument(
  private val content: String
) : Document {
  override fun read(): String {
    println("[실제 문서] 내용을 조회합니다.")
    return content
  }
}