<?php
/**
 * PluginSettings
 *
 * PHP version 7.2
 *
 * @category Class
 * @package  Ory\Kratos\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests.
 *
 * The version of the OpenAPI document: v0.6.0-alpha.15
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.1.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Ory\Kratos\Client\Model;

use \ArrayAccess;
use \Ory\Kratos\Client\ObjectSerializer;

/**
 * PluginSettings Class Doc Comment
 *
 * @category Class
 * @package  Ory\Kratos\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class PluginSettings implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'PluginSettings';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'args' => 'string[]',
        'devices' => '\Ory\Kratos\Client\Model\PluginDevice[]',
        'env' => 'string[]',
        'mounts' => '\Ory\Kratos\Client\Model\PluginMount[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'args' => null,
        'devices' => null,
        'env' => null,
        'mounts' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'args' => 'Args',
        'devices' => 'Devices',
        'env' => 'Env',
        'mounts' => 'Mounts'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'args' => 'setArgs',
        'devices' => 'setDevices',
        'env' => 'setEnv',
        'mounts' => 'setMounts'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'args' => 'getArgs',
        'devices' => 'getDevices',
        'env' => 'getEnv',
        'mounts' => 'getMounts'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['args'] = $data['args'] ?? null;
        $this->container['devices'] = $data['devices'] ?? null;
        $this->container['env'] = $data['env'] ?? null;
        $this->container['mounts'] = $data['mounts'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['args'] === null) {
            $invalidProperties[] = "'args' can't be null";
        }
        if ($this->container['devices'] === null) {
            $invalidProperties[] = "'devices' can't be null";
        }
        if ($this->container['env'] === null) {
            $invalidProperties[] = "'env' can't be null";
        }
        if ($this->container['mounts'] === null) {
            $invalidProperties[] = "'mounts' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets args
     *
     * @return string[]
     */
    public function getArgs()
    {
        return $this->container['args'];
    }

    /**
     * Sets args
     *
     * @param string[] $args args
     *
     * @return self
     */
    public function setArgs($args)
    {
        $this->container['args'] = $args;

        return $this;
    }

    /**
     * Gets devices
     *
     * @return \Ory\Kratos\Client\Model\PluginDevice[]
     */
    public function getDevices()
    {
        return $this->container['devices'];
    }

    /**
     * Sets devices
     *
     * @param \Ory\Kratos\Client\Model\PluginDevice[] $devices devices
     *
     * @return self
     */
    public function setDevices($devices)
    {
        $this->container['devices'] = $devices;

        return $this;
    }

    /**
     * Gets env
     *
     * @return string[]
     */
    public function getEnv()
    {
        return $this->container['env'];
    }

    /**
     * Sets env
     *
     * @param string[] $env env
     *
     * @return self
     */
    public function setEnv($env)
    {
        $this->container['env'] = $env;

        return $this;
    }

    /**
     * Gets mounts
     *
     * @return \Ory\Kratos\Client\Model\PluginMount[]
     */
    public function getMounts()
    {
        return $this->container['mounts'];
    }

    /**
     * Sets mounts
     *
     * @param \Ory\Kratos\Client\Model\PluginMount[] $mounts mounts
     *
     * @return self
     */
    public function setMounts($mounts)
    {
        $this->container['mounts'] = $mounts;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


