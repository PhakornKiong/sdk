# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.Usage do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :GenericUsage
  ]

  @type t :: %__MODULE__{
    :GenericUsage => Ory.Model.GenericUsage.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.Usage do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:GenericUsage, :struct, Ory.Model.GenericUsage, options)
  end
end

