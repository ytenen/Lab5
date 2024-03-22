/**
 * The {@code Add} class implements the {@link Command} interface to handle the execution
 * of adding an organization to the collection managed by {@link OrganizationManager}.
 */
package managers.commands;


import data.generators.IdGenerator;
import data.generators.OrganizationGenerator;
import managers.CollectionManager;

public class Add implements Command {

    /**
     * Executes the "add" command, allowing the user to input information for a new
     * organization and adding it to the collection managed.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    @Override
    public void execute(String[] args) {
        CollectionManager.add(OrganizationGenerator.createOrganization(IdGenerator.generateId()));
    }
}
