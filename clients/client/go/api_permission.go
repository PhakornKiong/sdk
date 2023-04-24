/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.25
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
)


type PermissionApi interface {

	/*
	CheckPermission Check a permission

	To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return PermissionApiCheckPermissionRequest
	*/
	CheckPermission(ctx context.Context) PermissionApiCheckPermissionRequest

	// CheckPermissionExecute executes the request
	//  @return CheckPermissionResult
	CheckPermissionExecute(r PermissionApiCheckPermissionRequest) (*CheckPermissionResult, *http.Response, error)

	/*
	CheckPermissionOrError Check a permission

	To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return PermissionApiCheckPermissionOrErrorRequest
	*/
	CheckPermissionOrError(ctx context.Context) PermissionApiCheckPermissionOrErrorRequest

	// CheckPermissionOrErrorExecute executes the request
	//  @return CheckPermissionResult
	CheckPermissionOrErrorExecute(r PermissionApiCheckPermissionOrErrorRequest) (*CheckPermissionResult, *http.Response, error)

	/*
	ExpandPermissions Expand a Relationship into permissions.

	Use this endpoint to expand a relationship tuple into permissions.

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return PermissionApiExpandPermissionsRequest
	*/
	ExpandPermissions(ctx context.Context) PermissionApiExpandPermissionsRequest

	// ExpandPermissionsExecute executes the request
	//  @return ExpandedPermissionTree
	ExpandPermissionsExecute(r PermissionApiExpandPermissionsRequest) (*ExpandedPermissionTree, *http.Response, error)

	/*
	PostCheckPermission Check a permission

	To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return PermissionApiPostCheckPermissionRequest
	*/
	PostCheckPermission(ctx context.Context) PermissionApiPostCheckPermissionRequest

	// PostCheckPermissionExecute executes the request
	//  @return CheckPermissionResult
	PostCheckPermissionExecute(r PermissionApiPostCheckPermissionRequest) (*CheckPermissionResult, *http.Response, error)

	/*
	PostCheckPermissionOrError Check a permission

	To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return PermissionApiPostCheckPermissionOrErrorRequest
	*/
	PostCheckPermissionOrError(ctx context.Context) PermissionApiPostCheckPermissionOrErrorRequest

	// PostCheckPermissionOrErrorExecute executes the request
	//  @return CheckPermissionResult
	PostCheckPermissionOrErrorExecute(r PermissionApiPostCheckPermissionOrErrorRequest) (*CheckPermissionResult, *http.Response, error)
}

// PermissionApiService PermissionApi service
type PermissionApiService service

type PermissionApiCheckPermissionRequest struct {
	ctx context.Context
	ApiService PermissionApi
	namespace *string
	object *string
	relation *string
	subjectId *string
	subjectSetNamespace *string
	subjectSetObject *string
	subjectSetRelation *string
	maxDepth *int64
}

// Namespace of the Relationship
func (r PermissionApiCheckPermissionRequest) Namespace(namespace string) PermissionApiCheckPermissionRequest {
	r.namespace = &namespace
	return r
}

// Object of the Relationship
func (r PermissionApiCheckPermissionRequest) Object(object string) PermissionApiCheckPermissionRequest {
	r.object = &object
	return r
}

// Relation of the Relationship
func (r PermissionApiCheckPermissionRequest) Relation(relation string) PermissionApiCheckPermissionRequest {
	r.relation = &relation
	return r
}

// SubjectID of the Relationship
func (r PermissionApiCheckPermissionRequest) SubjectId(subjectId string) PermissionApiCheckPermissionRequest {
	r.subjectId = &subjectId
	return r
}

// Namespace of the Subject Set
func (r PermissionApiCheckPermissionRequest) SubjectSetNamespace(subjectSetNamespace string) PermissionApiCheckPermissionRequest {
	r.subjectSetNamespace = &subjectSetNamespace
	return r
}

// Object of the Subject Set
func (r PermissionApiCheckPermissionRequest) SubjectSetObject(subjectSetObject string) PermissionApiCheckPermissionRequest {
	r.subjectSetObject = &subjectSetObject
	return r
}

// Relation of the Subject Set
func (r PermissionApiCheckPermissionRequest) SubjectSetRelation(subjectSetRelation string) PermissionApiCheckPermissionRequest {
	r.subjectSetRelation = &subjectSetRelation
	return r
}

func (r PermissionApiCheckPermissionRequest) MaxDepth(maxDepth int64) PermissionApiCheckPermissionRequest {
	r.maxDepth = &maxDepth
	return r
}

func (r PermissionApiCheckPermissionRequest) Execute() (*CheckPermissionResult, *http.Response, error) {
	return r.ApiService.CheckPermissionExecute(r)
}

/*
CheckPermission Check a permission

To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return PermissionApiCheckPermissionRequest
*/
func (a *PermissionApiService) CheckPermission(ctx context.Context) PermissionApiCheckPermissionRequest {
	return PermissionApiCheckPermissionRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return CheckPermissionResult
func (a *PermissionApiService) CheckPermissionExecute(r PermissionApiCheckPermissionRequest) (*CheckPermissionResult, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CheckPermissionResult
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PermissionApiService.CheckPermission")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/relation-tuples/check/openapi"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.namespace != nil {
		localVarQueryParams.Add("namespace", parameterToString(*r.namespace, ""))
	}
	if r.object != nil {
		localVarQueryParams.Add("object", parameterToString(*r.object, ""))
	}
	if r.relation != nil {
		localVarQueryParams.Add("relation", parameterToString(*r.relation, ""))
	}
	if r.subjectId != nil {
		localVarQueryParams.Add("subject_id", parameterToString(*r.subjectId, ""))
	}
	if r.subjectSetNamespace != nil {
		localVarQueryParams.Add("subject_set.namespace", parameterToString(*r.subjectSetNamespace, ""))
	}
	if r.subjectSetObject != nil {
		localVarQueryParams.Add("subject_set.object", parameterToString(*r.subjectSetObject, ""))
	}
	if r.subjectSetRelation != nil {
		localVarQueryParams.Add("subject_set.relation", parameterToString(*r.subjectSetRelation, ""))
	}
	if r.maxDepth != nil {
		localVarQueryParams.Add("max-depth", parameterToString(*r.maxDepth, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type PermissionApiCheckPermissionOrErrorRequest struct {
	ctx context.Context
	ApiService PermissionApi
	namespace *string
	object *string
	relation *string
	subjectId *string
	subjectSetNamespace *string
	subjectSetObject *string
	subjectSetRelation *string
	maxDepth *int64
}

// Namespace of the Relationship
func (r PermissionApiCheckPermissionOrErrorRequest) Namespace(namespace string) PermissionApiCheckPermissionOrErrorRequest {
	r.namespace = &namespace
	return r
}

// Object of the Relationship
func (r PermissionApiCheckPermissionOrErrorRequest) Object(object string) PermissionApiCheckPermissionOrErrorRequest {
	r.object = &object
	return r
}

// Relation of the Relationship
func (r PermissionApiCheckPermissionOrErrorRequest) Relation(relation string) PermissionApiCheckPermissionOrErrorRequest {
	r.relation = &relation
	return r
}

// SubjectID of the Relationship
func (r PermissionApiCheckPermissionOrErrorRequest) SubjectId(subjectId string) PermissionApiCheckPermissionOrErrorRequest {
	r.subjectId = &subjectId
	return r
}

// Namespace of the Subject Set
func (r PermissionApiCheckPermissionOrErrorRequest) SubjectSetNamespace(subjectSetNamespace string) PermissionApiCheckPermissionOrErrorRequest {
	r.subjectSetNamespace = &subjectSetNamespace
	return r
}

// Object of the Subject Set
func (r PermissionApiCheckPermissionOrErrorRequest) SubjectSetObject(subjectSetObject string) PermissionApiCheckPermissionOrErrorRequest {
	r.subjectSetObject = &subjectSetObject
	return r
}

// Relation of the Subject Set
func (r PermissionApiCheckPermissionOrErrorRequest) SubjectSetRelation(subjectSetRelation string) PermissionApiCheckPermissionOrErrorRequest {
	r.subjectSetRelation = &subjectSetRelation
	return r
}

func (r PermissionApiCheckPermissionOrErrorRequest) MaxDepth(maxDepth int64) PermissionApiCheckPermissionOrErrorRequest {
	r.maxDepth = &maxDepth
	return r
}

func (r PermissionApiCheckPermissionOrErrorRequest) Execute() (*CheckPermissionResult, *http.Response, error) {
	return r.ApiService.CheckPermissionOrErrorExecute(r)
}

/*
CheckPermissionOrError Check a permission

To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return PermissionApiCheckPermissionOrErrorRequest
*/
func (a *PermissionApiService) CheckPermissionOrError(ctx context.Context) PermissionApiCheckPermissionOrErrorRequest {
	return PermissionApiCheckPermissionOrErrorRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return CheckPermissionResult
func (a *PermissionApiService) CheckPermissionOrErrorExecute(r PermissionApiCheckPermissionOrErrorRequest) (*CheckPermissionResult, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CheckPermissionResult
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PermissionApiService.CheckPermissionOrError")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/relation-tuples/check"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.namespace != nil {
		localVarQueryParams.Add("namespace", parameterToString(*r.namespace, ""))
	}
	if r.object != nil {
		localVarQueryParams.Add("object", parameterToString(*r.object, ""))
	}
	if r.relation != nil {
		localVarQueryParams.Add("relation", parameterToString(*r.relation, ""))
	}
	if r.subjectId != nil {
		localVarQueryParams.Add("subject_id", parameterToString(*r.subjectId, ""))
	}
	if r.subjectSetNamespace != nil {
		localVarQueryParams.Add("subject_set.namespace", parameterToString(*r.subjectSetNamespace, ""))
	}
	if r.subjectSetObject != nil {
		localVarQueryParams.Add("subject_set.object", parameterToString(*r.subjectSetObject, ""))
	}
	if r.subjectSetRelation != nil {
		localVarQueryParams.Add("subject_set.relation", parameterToString(*r.subjectSetRelation, ""))
	}
	if r.maxDepth != nil {
		localVarQueryParams.Add("max-depth", parameterToString(*r.maxDepth, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 403 {
			var v CheckPermissionResult
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type PermissionApiExpandPermissionsRequest struct {
	ctx context.Context
	ApiService PermissionApi
	namespace *string
	object *string
	relation *string
	maxDepth *int64
}

// Namespace of the Subject Set
func (r PermissionApiExpandPermissionsRequest) Namespace(namespace string) PermissionApiExpandPermissionsRequest {
	r.namespace = &namespace
	return r
}

// Object of the Subject Set
func (r PermissionApiExpandPermissionsRequest) Object(object string) PermissionApiExpandPermissionsRequest {
	r.object = &object
	return r
}

// Relation of the Subject Set
func (r PermissionApiExpandPermissionsRequest) Relation(relation string) PermissionApiExpandPermissionsRequest {
	r.relation = &relation
	return r
}

func (r PermissionApiExpandPermissionsRequest) MaxDepth(maxDepth int64) PermissionApiExpandPermissionsRequest {
	r.maxDepth = &maxDepth
	return r
}

func (r PermissionApiExpandPermissionsRequest) Execute() (*ExpandedPermissionTree, *http.Response, error) {
	return r.ApiService.ExpandPermissionsExecute(r)
}

/*
ExpandPermissions Expand a Relationship into permissions.

Use this endpoint to expand a relationship tuple into permissions.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return PermissionApiExpandPermissionsRequest
*/
func (a *PermissionApiService) ExpandPermissions(ctx context.Context) PermissionApiExpandPermissionsRequest {
	return PermissionApiExpandPermissionsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ExpandedPermissionTree
func (a *PermissionApiService) ExpandPermissionsExecute(r PermissionApiExpandPermissionsRequest) (*ExpandedPermissionTree, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ExpandedPermissionTree
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PermissionApiService.ExpandPermissions")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/relation-tuples/expand"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.namespace == nil {
		return localVarReturnValue, nil, reportError("namespace is required and must be specified")
	}
	if r.object == nil {
		return localVarReturnValue, nil, reportError("object is required and must be specified")
	}
	if r.relation == nil {
		return localVarReturnValue, nil, reportError("relation is required and must be specified")
	}

	localVarQueryParams.Add("namespace", parameterToString(*r.namespace, ""))
	localVarQueryParams.Add("object", parameterToString(*r.object, ""))
	localVarQueryParams.Add("relation", parameterToString(*r.relation, ""))
	if r.maxDepth != nil {
		localVarQueryParams.Add("max-depth", parameterToString(*r.maxDepth, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type PermissionApiPostCheckPermissionRequest struct {
	ctx context.Context
	ApiService PermissionApi
	maxDepth *int64
	postCheckPermissionBody *PostCheckPermissionBody
}

func (r PermissionApiPostCheckPermissionRequest) MaxDepth(maxDepth int64) PermissionApiPostCheckPermissionRequest {
	r.maxDepth = &maxDepth
	return r
}

func (r PermissionApiPostCheckPermissionRequest) PostCheckPermissionBody(postCheckPermissionBody PostCheckPermissionBody) PermissionApiPostCheckPermissionRequest {
	r.postCheckPermissionBody = &postCheckPermissionBody
	return r
}

func (r PermissionApiPostCheckPermissionRequest) Execute() (*CheckPermissionResult, *http.Response, error) {
	return r.ApiService.PostCheckPermissionExecute(r)
}

/*
PostCheckPermission Check a permission

To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return PermissionApiPostCheckPermissionRequest
*/
func (a *PermissionApiService) PostCheckPermission(ctx context.Context) PermissionApiPostCheckPermissionRequest {
	return PermissionApiPostCheckPermissionRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return CheckPermissionResult
func (a *PermissionApiService) PostCheckPermissionExecute(r PermissionApiPostCheckPermissionRequest) (*CheckPermissionResult, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CheckPermissionResult
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PermissionApiService.PostCheckPermission")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/relation-tuples/check/openapi"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.maxDepth != nil {
		localVarQueryParams.Add("max-depth", parameterToString(*r.maxDepth, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.postCheckPermissionBody
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type PermissionApiPostCheckPermissionOrErrorRequest struct {
	ctx context.Context
	ApiService PermissionApi
	maxDepth *int64
	postCheckPermissionOrErrorBody *PostCheckPermissionOrErrorBody
}

// nolint:deadcode,unused
func (r PermissionApiPostCheckPermissionOrErrorRequest) MaxDepth(maxDepth int64) PermissionApiPostCheckPermissionOrErrorRequest {
	r.maxDepth = &maxDepth
	return r
}

func (r PermissionApiPostCheckPermissionOrErrorRequest) PostCheckPermissionOrErrorBody(postCheckPermissionOrErrorBody PostCheckPermissionOrErrorBody) PermissionApiPostCheckPermissionOrErrorRequest {
	r.postCheckPermissionOrErrorBody = &postCheckPermissionOrErrorBody
	return r
}

func (r PermissionApiPostCheckPermissionOrErrorRequest) Execute() (*CheckPermissionResult, *http.Response, error) {
	return r.ApiService.PostCheckPermissionOrErrorExecute(r)
}

/*
PostCheckPermissionOrError Check a permission

To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return PermissionApiPostCheckPermissionOrErrorRequest
*/
func (a *PermissionApiService) PostCheckPermissionOrError(ctx context.Context) PermissionApiPostCheckPermissionOrErrorRequest {
	return PermissionApiPostCheckPermissionOrErrorRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return CheckPermissionResult
func (a *PermissionApiService) PostCheckPermissionOrErrorExecute(r PermissionApiPostCheckPermissionOrErrorRequest) (*CheckPermissionResult, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CheckPermissionResult
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PermissionApiService.PostCheckPermissionOrError")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/relation-tuples/check"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.maxDepth != nil {
		localVarQueryParams.Add("max-depth", parameterToString(*r.maxDepth, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.postCheckPermissionOrErrorBody
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 403 {
			var v CheckPermissionResult
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
