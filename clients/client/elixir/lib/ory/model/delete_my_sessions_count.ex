# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.DeleteMySessionsCount do
  @moduledoc """
  Deleted Session Count
  """

  @derive [Poison.Encoder]
  defstruct [
    :count
  ]

  @type t :: %__MODULE__{
    :count => integer() | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.DeleteMySessionsCount do
  def decode(value, _options) do
    value
  end
end

