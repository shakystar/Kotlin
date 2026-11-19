package structural.proxy.protection

import structural.proxy.document.Document

class DocumentProxy(
  private val document: Document,
  private val canRead: Boolean
) : Document {
  override fun read(): String {
    if (!canRead) {
      throw SecurityException("문서를 읽을 권한이 없습니다.")
    }

    return document.read()
  }
}