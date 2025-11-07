package com.example.lab1.models.commands;

public class DeleteBookCommand implements Command {
    private final CommandContext context;

    public DeleteBookCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Object execute() {
        context.getBooksService().deleteBook(context.getId());
        return "Book deleted successfully!";
    }
}