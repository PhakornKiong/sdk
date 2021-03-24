//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RecoveryFlowMethod {
  /// Returns a new [RecoveryFlowMethod] instance.
  RecoveryFlowMethod({
    @required this.config,
    @required this.method,
  });

  RecoveryFlowMethodConfig config;

  /// Method contains the request credentials type.
  String method;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RecoveryFlowMethod &&
     other.config == config &&
     other.method == method;

  @override
  int get hashCode =>
    (config == null ? 0 : config.hashCode) +
    (method == null ? 0 : method.hashCode);

  @override
  String toString() => 'RecoveryFlowMethod[config=$config, method=$method]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (config != null) {
      json[r'config'] = config;
    }
    if (method != null) {
      json[r'method'] = method;
    }
    return json;
  }

  /// Returns a new [RecoveryFlowMethod] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static RecoveryFlowMethod fromJson(Map<String, dynamic> json) => json == null
    ? null
    : RecoveryFlowMethod(
        config: RecoveryFlowMethodConfig.fromJson(json[r'config']),
        method: json[r'method'],
    );

  static List<RecoveryFlowMethod> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <RecoveryFlowMethod>[]
      : json.map((v) => RecoveryFlowMethod.fromJson(v)).toList(growable: true == growable);

  static Map<String, RecoveryFlowMethod> mapFromJson(Map<String, dynamic> json) {
    final map = <String, RecoveryFlowMethod>{};
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic v) => map[key] = RecoveryFlowMethod.fromJson(v));
    }
    return map;
  }

  // maps a json object with a list of RecoveryFlowMethod-objects as value to a dart map
  static Map<String, List<RecoveryFlowMethod>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<RecoveryFlowMethod>>{};
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic v) {
        map[key] = RecoveryFlowMethod.listFromJson(v, emptyIsNull: emptyIsNull, growable: growable);
      });
    }
    return map;
  }
}

