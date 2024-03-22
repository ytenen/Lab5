/**
 * The {@code RemoveFirst} class implements the {@link interfaces.Command} interface to handle the execution
 * of the "remove_first" command, removing the first organization from the collection managed by
 * {@link dataManager.OrganizationManager}.
 */
package managers.commands;


import data.Organization;
import managers.CollectionManager;

import java.util.ArrayDeque;

public class RemoveFirst implements Command {

    /**
     * Executes the "remove_first" command, removing the first organization from the collection.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    @Override
    public void execute(String[] args) {
        ArrayDeque<Organization> dec = CollectionManager.getCollection();
        dec.removeFirst();
        CollectionManager.setCollection(dec);
    }
}
