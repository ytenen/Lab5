/**
 * The {@code Clear} class implements the {@link Command} interface to handle the execution
 * of clearing the collection of organizations managed by {@link OrganizationManager}.
 */
package managers.commands;


import data.Organization;
import managers.CollectionManager;

import java.util.ArrayDeque;

public class Clear implements Command {

    /**
     * Executes the "clear" command, removing all organizations from the collection
     * managed.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    @Override
    public void execute(String[] args) {
        // Clear the collection of organizations
        ArrayDeque<Organization> collection =CollectionManager.getCollection();
        collection.clear();
        CollectionManager.setCollection(collection);
    }
}
