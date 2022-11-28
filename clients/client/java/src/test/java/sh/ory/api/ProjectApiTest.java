/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.1
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.ActiveProjectInConsole;
import sh.ory.model.CloudAccount;
import sh.ory.model.CreateProjectApiKeyRequest;
import sh.ory.model.CreateProjectBody;
import sh.ory.model.ErrorGeneric;
import sh.ory.model.GenericError;
import sh.ory.model.JsonPatch;
import sh.ory.model.Project;
import sh.ory.model.ProjectApiKey;
import sh.ory.model.ProjectMetadata;
import sh.ory.model.SetActiveProjectInConsoleBody;
import sh.ory.model.SetProject;
import sh.ory.model.SuccessfulProjectUpdate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectApi
 */
@Disabled
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    /**
     * Create a Project
     *
     * Creates a new project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        CreateProjectBody createProjectBody = null;
        Project response = api.createProject(createProjectBody);
        // TODO: test validations
    }

    /**
     * Create project API token
     *
     * Create an API token for a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectApiKeyTest() throws ApiException {
        String project = null;
        CreateProjectApiKeyRequest createProjectApiKeyRequest = null;
        ProjectApiKey response = api.createProjectApiKey(project, createProjectApiKeyRequest);
        // TODO: test validations
    }

    /**
     * Delete project API token
     *
     * Deletes an API token and immediately removes it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectApiKeyTest() throws ApiException {
        String project = null;
        String tokenId = null;
        api.deleteProjectApiKey(project, tokenId);
        // TODO: test validations
    }

    /**
     * Returns the Ory Network Project selected in the Ory Network Console
     *
     * Use this API to get your active project in the Ory Network Console UI.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActiveProjectInConsoleTest() throws ApiException {
        ActiveProjectInConsole response = api.getActiveProjectInConsole();
        // TODO: test validations
    }

    /**
     * Get a Project
     *
     * Get a projects you have access to by its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String projectId = null;
        Project response = api.getProject(projectId);
        // TODO: test validations
    }

    /**
     * Get all members associated with this project
     *
     * This endpoint requires the user to be a member of the project with the role &#x60;OWNER&#x60; or &#x60;DEVELOPER&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectMembersTest() throws ApiException {
        String projectId = null;
        List<CloudAccount> response = api.getProjectMembers(projectId);
        // TODO: test validations
    }

    /**
     * List a project&#39;s API Tokens
     *
     * A list of all the project&#39;s API tokens.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectApiKeysTest() throws ApiException {
        String project = null;
        List<ProjectApiKey> response = api.listProjectApiKeys(project);
        // TODO: test validations
    }

    /**
     * List All Projects
     *
     * Lists all projects you have access to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectsTest() throws ApiException {
        List<ProjectMetadata> response = api.listProjects();
        // TODO: test validations
    }

    /**
     * Patch an Ory Network Project Configuration
     *
     * Deprecated: Use the &#x60;patchProjectWithRevision&#x60; endpoint instead to specify the exact revision the patch was generated for.  This endpoints allows you to patch individual Ory Network project configuration keys for Ory&#39;s services (identity, permission, ...). The configuration format is fully compatible with the open source projects for the respective services (e.g. Ory Kratos for Identity, Ory Keto for Permissions).  This endpoint expects the &#x60;version&#x60; key to be set in the payload. If it is unset, it will try to import the config as if it is from the most recent version.  If you have an older version of a configuration, you should set the version key in the payload!  While this endpoint is able to process all configuration items related to features (e.g. password reset), it does not support operational configuration items (e.g. port, tracing, logging) otherwise available in the open source.  For configuration items that can not be translated to the Ory Network, this endpoint will return a list of warnings to help you understand which parts of your config could not be processed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchProjectTest() throws ApiException {
        String projectId = null;
        List<JsonPatch> jsonPatch = null;
        SuccessfulProjectUpdate response = api.patchProject(projectId, jsonPatch);
        // TODO: test validations
    }

    /**
     * Irrecoverably purge a project
     *
     * !! Use with extreme caution !!  Using this API endpoint you can purge (completely delete) a project and its data. This action can not be undone and will delete ALL your data.  !! Use with extreme caution !!
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void purgeProjectTest() throws ApiException {
        String projectId = null;
        api.purgeProject(projectId);
        // TODO: test validations
    }

    /**
     * Remove a member associated with this project
     *
     * This also sets their invite status to &#x60;REMOVED&#x60;. This endpoint requires the user to be a member of the project with the role &#x60;OWNER&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeProjectMemberTest() throws ApiException {
        String projectId = null;
        String memberId = null;
        api.removeProjectMember(projectId, memberId);
        // TODO: test validations
    }

    /**
     * Sets the Ory Network Project active in the Ory Network Console
     *
     * Use this API to set your active project in the Ory Network Console UI.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setActiveProjectInConsoleTest() throws ApiException {
        SetActiveProjectInConsoleBody setActiveProjectInConsoleBody = null;
        api.setActiveProjectInConsole(setActiveProjectInConsoleBody);
        // TODO: test validations
    }

    /**
     * Update an Ory Network Project Configuration
     *
     * This endpoints allows you to update the Ory Network project configuration for individual services (identity, permission, ...). The configuration is fully compatible with the open source projects for the respective services (e.g. Ory Kratos for Identity, Ory Keto for Permissions).  This endpoint expects the &#x60;version&#x60; key to be set in the payload. If it is unset, it will try to import the config as if it is from the most recent version.  If you have an older version of a configuration, you should set the version key in the payload!  While this endpoint is able to process all configuration items related to features (e.g. password reset), it does not support operational configuration items (e.g. port, tracing, logging) otherwise available in the open source.  For configuration items that can not be translated to the Ory Network, this endpoint will return a list of warnings to help you understand which parts of your config could not be processed.  Be aware that updating any service&#39;s configuration will completely override your current configuration for that service!
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setProjectTest() throws ApiException {
        String projectId = null;
        SetProject setProject = null;
        SuccessfulProjectUpdate response = api.setProject(projectId, setProject);
        // TODO: test validations
    }

}