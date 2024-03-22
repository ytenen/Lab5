package managers;

import exeptions.UnknowCommandException;
import managers.commands.Command;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private static Map<String, Command> commands;
    public static ArrayDeque<Command> lastCommands = new ArrayDeque<>();

    public CommandManager(){
        commands = new HashMap<>();

    }

    public static void startExecuting(String line) throws UnknowCommandException {
        String commandName = line.split(" ")[0];
        if (!commands.containsKey(commandName)){
            throw new UnknowCommandException(commandName);
        }
        Command command = commands.get(commandName);
        command.execute(line.split(" "));
        if (!(lastCommands == null) && lastCommands.size()==6){
            lastCommands.pop();
            lastCommands.addLast(command);
        }else{
            assert lastCommands != null;
            lastCommands.addFirst(command);
        }
    }

    public Map<String, Command> getCommands(){
        return commands;
    }
}
