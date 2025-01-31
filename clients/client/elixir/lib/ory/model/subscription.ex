# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.Subscription do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :created_at,
    :current_interval,
    :current_plan,
    :customer_id,
    :id,
    :interval_changes_to,
    :ongoing_stripe_checkout_id,
    :payed_until,
    :plan_changes_at,
    :plan_changes_to,
    :status,
    :updated_at
  ]

  @type t :: %__MODULE__{
    :created_at => DateTime.t,
    :current_interval => String.t,
    :current_plan => String.t,
    :customer_id => String.t,
    :id => String.t,
    :interval_changes_to => String.t | nil,
    :ongoing_stripe_checkout_id => String.t | nil,
    :payed_until => DateTime.t,
    :plan_changes_at => DateTime.t | nil,
    :plan_changes_to => String.t | nil,
    :status => String.t,
    :updated_at => DateTime.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.Subscription do
  def decode(value, _options) do
    value
  end
end

