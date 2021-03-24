//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiClient {
  ApiClient({this.basePath = 'http://localhost'}) {
    // Setup authentications (key: authentication name, value: authentication).
    _authentications[r'sessionToken'] = ApiKeyAuth('header', 'X-Session-Token');
  }

  final String basePath;

  var _client = Client();

  /// Returns the current HTTP [Client] instance to use in this class.
  ///
  /// The return value is guaranteed to never be null.
  Client get client => _client;

  /// Requests to use a new HTTP [Client] in this class.
  ///
  /// If the [newClient] is null, an [ArgumentError] is thrown.
  set client(Client newClient) {
    if (newClient == null) {
      throw ArgumentError('New client instance cannot be null.');
    }
    _client = newClient;
  }

  final _defaultHeaderMap = <String, String>{};
  final _authentications = <String, Authentication>{};

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  dynamic deserialize(String json, String targetType, {bool growable}) {
    // Remove all spaces.  Necessary for reg expressions as well.
    targetType = targetType.replaceAll(' ', '');

    return targetType == 'String'
      ? json
      : _deserialize(jsonDecode(json), targetType, growable: true == growable);
  }

  String serialize(Object obj) => obj == null ? '' : json.encode(obj);

  T getAuthentication<T extends Authentication>(String name) {
    final authentication = _authentications[name];
    return authentication is T ? authentication : null;
  }

  // We don’t use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi', a key might appear multiple times.
  Future<Response> invokeAPI(
    String path,
    String method,
    Iterable<QueryParam> queryParams,
    Object body,
    Map<String, String> headerParams,
    Map<String, String> formParams,
    String nullableContentType,
    List<String> authNames,
  ) async {
    _updateParamsForAuth(authNames, queryParams, headerParams);

    headerParams.addAll(_defaultHeaderMap);

    final urlEncodedQueryParams = queryParams
      .where((param) => param.value != null)
      .map((param) => '$param');

    final queryString = urlEncodedQueryParams.isNotEmpty
      ? '?${urlEncodedQueryParams.join('&')}'
      : '';

    final url = '$basePath$path$queryString';

    if (nullableContentType != null) {
      headerParams['Content-Type'] = nullableContentType;
    }

    try {
      // Special case for uploading a single file which isn’t a 'multipart/form-data'.
      if (
        body is MultipartFile && (nullableContentType == null ||
        !nullableContentType.toLowerCase().startsWith('multipart/form-data'))
      ) {
        final request = StreamedRequest(method, Uri.parse(url));
        request.headers.addAll(headerParams);
        request.contentLength = body.length;
        body.finalize().listen(
          request.sink.add,
          onDone: request.sink.close,
          onError: (error, trace) => request.sink.close(),
          cancelOnError: true,
        );
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      if (body is MultipartRequest) {
        final request = MultipartRequest(method, Uri.parse(url));
        request.fields.addAll(body.fields);
        request.files.addAll(body.files);
        request.headers.addAll(body.headers);
        request.headers.addAll(headerParams);
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      final msgBody = nullableContentType == 'application/x-www-form-urlencoded'
        ? formParams
        : serialize(body);
      final nullableHeaderParams = headerParams.isEmpty ? null : headerParams;

      switch(method) {
        case 'POST': return await _client.post(url, headers: nullableHeaderParams, body: msgBody,);
        case 'PUT': return await _client.put(url, headers: nullableHeaderParams, body: msgBody,);
        case 'DELETE': return await _client.delete(url, headers: nullableHeaderParams,);
        case 'PATCH': return await _client.patch(url, headers: nullableHeaderParams, body: msgBody,);
        case 'HEAD': return await _client.head(url, headers: nullableHeaderParams,);
        case 'GET': return await _client.get(url, headers: nullableHeaderParams,);
      }
    } on SocketException catch (e, trace) {
      throw ApiException.withInner(HttpStatus.badRequest, 'Socket operation failed: $method $path', e, trace,);
    } on TlsException catch (e, trace) {
      throw ApiException.withInner(HttpStatus.badRequest, 'TLS/SSL communication failed: $method $path', e, trace,);
    } on IOException catch (e, trace) {
      throw ApiException.withInner(HttpStatus.badRequest, 'I/O operation failed: $method $path', e, trace,);
    } on ClientException catch (e, trace) {
      throw ApiException.withInner(HttpStatus.badRequest, 'HTTP connection failed: $method $path', e, trace,);
    } on Exception catch (e, trace) {
      throw ApiException.withInner(HttpStatus.badRequest, 'Exception occurred: $method $path', e, trace,);
    }

    throw ApiException(HttpStatus.badRequest, 'Invalid HTTP operation: $method $path',);
  }

  dynamic _deserialize(dynamic value, String targetType, {bool growable}) {
    try {
      switch (targetType) {
        case 'String':
          return '$value';
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'bool':
          if (value is bool) {
            return value;
          }
          final valueString = '$value'.toLowerCase();
          return valueString == 'true' || valueString == '1';
          break;
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'CompleteSelfServiceLoginFlowWithPasswordMethod':
          return CompleteSelfServiceLoginFlowWithPasswordMethod.fromJson(value);
        case 'CompleteSelfServiceRecoveryFlowWithLinkMethod':
          return CompleteSelfServiceRecoveryFlowWithLinkMethod.fromJson(value);
        case 'CompleteSelfServiceSettingsFlowWithPasswordMethod':
          return CompleteSelfServiceSettingsFlowWithPasswordMethod.fromJson(value);
        case 'CompleteSelfServiceVerificationFlowWithLinkMethod':
          return CompleteSelfServiceVerificationFlowWithLinkMethod.fromJson(value);
        case 'CreateIdentity':
          return CreateIdentity.fromJson(value);
        case 'CreateRecoveryLink':
          return CreateRecoveryLink.fromJson(value);
        case 'ErrorContainer':
          return ErrorContainer.fromJson(value);
        case 'FormField':
          return FormField.fromJson(value);
        case 'GenericError':
          return GenericError.fromJson(value);
        case 'GenericErrorPayload':
          return GenericErrorPayload.fromJson(value);
        case 'HealthNotReadyStatus':
          return HealthNotReadyStatus.fromJson(value);
        case 'HealthStatus':
          return HealthStatus.fromJson(value);
        case 'Identity':
          return Identity.fromJson(value);
        case 'LoginFlow':
          return LoginFlow.fromJson(value);
        case 'LoginFlowMethod':
          return LoginFlowMethod.fromJson(value);
        case 'LoginFlowMethodConfig':
          return LoginFlowMethodConfig.fromJson(value);
        case 'LoginViaApiResponse':
          return LoginViaApiResponse.fromJson(value);
        case 'Message':
          return Message.fromJson(value);
        case 'RecoveryAddress':
          return RecoveryAddress.fromJson(value);
        case 'RecoveryFlow':
          return RecoveryFlow.fromJson(value);
        case 'RecoveryFlowMethod':
          return RecoveryFlowMethod.fromJson(value);
        case 'RecoveryFlowMethodConfig':
          return RecoveryFlowMethodConfig.fromJson(value);
        case 'RecoveryLink':
          return RecoveryLink.fromJson(value);
        case 'RegistrationFlow':
          return RegistrationFlow.fromJson(value);
        case 'RegistrationFlowMethod':
          return RegistrationFlowMethod.fromJson(value);
        case 'RegistrationFlowMethodConfig':
          return RegistrationFlowMethodConfig.fromJson(value);
        case 'RegistrationViaApiResponse':
          return RegistrationViaApiResponse.fromJson(value);
        case 'RevokeSession':
          return RevokeSession.fromJson(value);
        case 'Session':
          return Session.fromJson(value);
        case 'SettingsFlow':
          return SettingsFlow.fromJson(value);
        case 'SettingsFlowMethod':
          return SettingsFlowMethod.fromJson(value);
        case 'SettingsFlowMethodConfig':
          return SettingsFlowMethodConfig.fromJson(value);
        case 'SettingsViaApiResponse':
          return SettingsViaApiResponse.fromJson(value);
        case 'UpdateIdentity':
          return UpdateIdentity.fromJson(value);
        case 'VerifiableAddress':
          return VerifiableAddress.fromJson(value);
        case 'VerificationFlow':
          return VerificationFlow.fromJson(value);
        case 'VerificationFlowMethod':
          return VerificationFlowMethod.fromJson(value);
        case 'VerificationFlowMethodConfig':
          return VerificationFlowMethodConfig.fromJson(value);
        case 'Version':
          return Version.fromJson(value);
        default:
          Match match;
          if (value is List && (match = _regList.firstMatch(targetType)) != null) {
            final newTargetType = match[1];
            return value
              .map((v) => _deserialize(v, newTargetType, growable: growable))
              .toList(growable: true == growable);
          }
          if (value is Map && (match = _regMap.firstMatch(targetType)) != null) {
            final newTargetType = match[1];
            return Map.fromIterables(
              value.keys,
              value.values.map((v) => _deserialize(v, newTargetType, growable: growable)),
            );
          }
          break;
      }
    } on Exception catch (e, stack) {
      throw ApiException.withInner(HttpStatus.internalServerError, 'Exception during deserialization.', e, stack,);
    }
    throw ApiException(HttpStatus.internalServerError, 'Could not find a suitable class for deserialization',);
  }

  /// Update query and header parameters based on authentication settings.
  /// @param authNames The authentications to apply
  void _updateParamsForAuth(
    List<String> authNames,
    List<QueryParam> queryParams,
    Map<String, String> headerParams,
  ) {
    authNames.forEach((authName) {
      final auth = _authentications[authName];
      if (auth == null) {
        throw ArgumentError('Authentication undefined: $authName');
      }
      auth.applyToParams(queryParams, headerParams);
    });
  }
}
