# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.PatchDelta do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :action,
    :relation_tuple
  ]

  @type t :: %__MODULE__{
    :action => String.t | nil,
    :relation_tuple => Ory.Model.RelationTuple.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.PatchDelta do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:relation_tuple, :struct, Ory.Model.RelationTuple, options)
  end
end
