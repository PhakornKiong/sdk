# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CustomDomain do
  @moduledoc """
  Custom Hostname
  """

  @derive [Poison.Encoder]
  defstruct [
    :cookie_domain,
    :cors_allowed_origins,
    :cors_enabled,
    :created_at,
    :custom_ui_base_url,
    :hostname,
    :id,
    :ssl_status,
    :updated_at,
    :verification_errors,
    :verification_status
  ]

  @type t :: %__MODULE__{
    :cookie_domain => String.t | nil,
    :cors_allowed_origins => [String.t] | nil,
    :cors_enabled => boolean() | nil,
    :created_at => DateTime.t | nil,
    :custom_ui_base_url => String.t | nil,
    :hostname => String.t | nil,
    :id => String.t | nil,
    :ssl_status => String.t | nil,
    :updated_at => DateTime.t | nil,
    :verification_errors => [String.t] | nil,
    :verification_status => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.CustomDomain do
  def decode(value, _options) do
    value
  end
end

