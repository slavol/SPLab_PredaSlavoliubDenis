package com.example.lab1.models.commands;

public class UpdateBookCommand implements Command {
    private final CommandContext context;

    public UpdateBookCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Object execute() {
        String title = (String) context.getData();
        return context.getBooksService().updateBook(context.getId(), title);
    }
}