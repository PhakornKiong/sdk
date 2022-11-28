//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_quota.g.dart';

/// Project invite quota
///
/// Properties:
/// * [projectId] 
/// * [remainingSeats] 
/// * [totalSeats] 
@BuiltValue()
abstract class InviteQuota implements Built<InviteQuota, InviteQuotaBuilder> {
  @BuiltValueField(wireName: r'project_id')
  String? get projectId;

  @BuiltValueField(wireName: r'remaining_seats')
  int? get remainingSeats;

  @BuiltValueField(wireName: r'total_seats')
  int? get totalSeats;

  InviteQuota._();

  factory InviteQuota([void updates(InviteQuotaBuilder b)]) = _$InviteQuota;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteQuotaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteQuota> get serializer => _$InviteQuotaSerializer();
}

class _$InviteQuotaSerializer implements PrimitiveSerializer<InviteQuota> {
  @override
  final Iterable<Type> types = const [InviteQuota, _$InviteQuota];

  @override
  final String wireName = r'InviteQuota';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteQuota object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.projectId != null) {
      yield r'project_id';
      yield serializers.serialize(
        object.projectId,
        specifiedType: const FullType(String),
      );
    }
    if (object.remainingSeats != null) {
      yield r'remaining_seats';
      yield serializers.serialize(
        object.remainingSeats,
        specifiedType: const FullType(int),
      );
    }
    if (object.totalSeats != null) {
      yield r'total_seats';
      yield serializers.serialize(
        object.totalSeats,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteQuota object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteQuotaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'project_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.projectId = valueDes;
          break;
        case r'remaining_seats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.remainingSeats = valueDes;
          break;
        case r'total_seats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.totalSeats = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InviteQuota deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteQuotaBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}
