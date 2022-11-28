# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.ActiveProjectInConsole do
  @moduledoc """
  The Active Project ID
  """

  @derive [Poison.Encoder]
  defstruct [
    :project_id
  ]

  @type t :: %__MODULE__{
    :project_id => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.ActiveProjectInConsole do
  def decode(value, _options) do
    value
  end
end
