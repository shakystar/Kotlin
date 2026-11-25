package behavioral.command.command

interface CartCommand {
  fun execute()
  fun undo()
}