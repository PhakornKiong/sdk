import 'package:ory_kratos_client/api.dart';
import 'package:test/test.dart';

// tests for CreateIdentity
void main() {
  final instance = CreateIdentity();

  group('test CreateIdentity', () {
    // SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.
    // String schemaId
    test('to test the property `schemaId`', () async {
      // TODO
    });

    // Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.
    // Object traits
    test('to test the property `traits`', () async {
      // TODO
    });


  });

}
