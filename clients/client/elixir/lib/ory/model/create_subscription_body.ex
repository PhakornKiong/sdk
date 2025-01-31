# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CreateSubscriptionBody do
  @moduledoc """
  Create Subscription Request Body
  """

  @derive [Poison.Encoder]
  defstruct [
    :interval,
    :plan,
    :provision_first_project,
    :return_to
  ]

  @type t :: %__MODULE__{
    :interval => String.t,
    :plan => String.t,
    :provision_first_project => String.t,
    :return_to => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.CreateSubscriptionBody do
  def decode(value, _options) do
    value
  end
end

