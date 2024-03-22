/**
 * The {@code Info} class implements the {@link interfaces.Command} interface to handle the execution
 * of the "info" command, providing information about the collection managed by {@link dataManager.OrganizationManager}.
 */
package managers.commands;


import data.Organization;
import managers.CollectionManager;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Date;

public class Info implements Command {

    /**
     * Executes the "info" command, displaying information about the collection managed by.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    @Override
    public void execute(String[] args) {
        // Get an instance of OrganizationManager

        // Get the collection of organizations and the initialization date
        ArrayDeque<Organization> collection = CollectionManager.getCollection();
        LocalDate date = CollectionManager.getDate();

        // Display information about the collection
        System.out.printf("Тип коллекции: %s\n", collection.getClass());
        System.out.printf("Дата инициализации: %s\n", date == null ? "Коллекция не инициализирована" : date);
        System.out.printf("Количество элементов: %s\n", collection.size());
    }
}
