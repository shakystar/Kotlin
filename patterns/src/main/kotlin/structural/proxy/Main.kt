package structural.proxy

import structural.proxy.document.Document
import structural.proxy.document.SecretDocument
import structural.proxy.protection.DocumentProxy

fun main() {
  val document = SecretDocument("다음 분기 출시 계획")

  val allowed: Document = DocumentProxy(document, canRead = true)
  val denied: Document = DocumentProxy(document, canRead = false)

  println("=== 권한 있음 ===")
  println(allowed.read())

  println()

  println("=== 권한 없음 ===")
  try {
    println(denied.read())
  } catch (e: SecurityException) {
    println("접근 거부 : ${e.message}")
  }
}