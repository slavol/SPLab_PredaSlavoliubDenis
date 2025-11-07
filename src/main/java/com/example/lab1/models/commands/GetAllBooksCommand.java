package com.example.lab1.models.commands;

public class GetAllBooksCommand implements Command {
    private final CommandContext context;

    public GetAllBooksCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Object execute() {
        return context.getBooksService().getAllBooks();
    }
}