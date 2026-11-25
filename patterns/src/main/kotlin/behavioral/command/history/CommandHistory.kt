package behavioral.command.history

import behavioral.command.command.CartCommand

class CommandHistory {
  private val history = mutableListOf<CartCommand>()

  fun execute(command: CartCommand) {
    command.execute()
    history.add(command)
  }

  fun undoLast() {
    val command = history.lastOrNull() ?: return

    command.undo()
    history.removeAt(history.lastIndex)
  }
}