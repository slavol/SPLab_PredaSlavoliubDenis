package com.example.lab1.models.commands;

public class GetBookByIdCommand implements Command {
    private final CommandContext context;

    public GetBookByIdCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Object execute() {
        return context.getBooksService().getBook(context.getId());
    }
}