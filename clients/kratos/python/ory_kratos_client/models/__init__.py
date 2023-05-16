# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from ory_kratos_client.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from ory_kratos_client.model.authenticator_assurance_level import AuthenticatorAssuranceLevel
from ory_kratos_client.model.batch_patch_identities_response import BatchPatchIdentitiesResponse
from ory_kratos_client.model.continue_with import ContinueWith
from ory_kratos_client.model.continue_with_set_ory_session_token import ContinueWithSetOrySessionToken
from ory_kratos_client.model.continue_with_verification_ui import ContinueWithVerificationUi
from ory_kratos_client.model.continue_with_verification_ui_flow import ContinueWithVerificationUiFlow
from ory_kratos_client.model.courier_message_status import CourierMessageStatus
from ory_kratos_client.model.courier_message_type import CourierMessageType
from ory_kratos_client.model.create_identity_body import CreateIdentityBody
from ory_kratos_client.model.create_recovery_code_for_identity_body import CreateRecoveryCodeForIdentityBody
from ory_kratos_client.model.create_recovery_link_for_identity_body import CreateRecoveryLinkForIdentityBody
from ory_kratos_client.model.delete_my_sessions_count import DeleteMySessionsCount
from ory_kratos_client.model.error_authenticator_assurance_level_not_satisfied import ErrorAuthenticatorAssuranceLevelNotSatisfied
from ory_kratos_client.model.error_browser_location_change_required import ErrorBrowserLocationChangeRequired
from ory_kratos_client.model.error_flow_replaced import ErrorFlowReplaced
from ory_kratos_client.model.error_generic import ErrorGeneric
from ory_kratos_client.model.flow_error import FlowError
from ory_kratos_client.model.generic_error import GenericError
from ory_kratos_client.model.get_version200_response import GetVersion200Response
from ory_kratos_client.model.health_not_ready_status import HealthNotReadyStatus
from ory_kratos_client.model.health_status import HealthStatus
from ory_kratos_client.model.identity import Identity
from ory_kratos_client.model.identity_credentials import IdentityCredentials
from ory_kratos_client.model.identity_credentials_oidc import IdentityCredentialsOidc
from ory_kratos_client.model.identity_credentials_oidc_provider import IdentityCredentialsOidcProvider
from ory_kratos_client.model.identity_credentials_password import IdentityCredentialsPassword
from ory_kratos_client.model.identity_credentials_type import IdentityCredentialsType
from ory_kratos_client.model.identity_patch import IdentityPatch
from ory_kratos_client.model.identity_patch_response import IdentityPatchResponse
from ory_kratos_client.model.identity_schema_container import IdentitySchemaContainer
from ory_kratos_client.model.identity_schemas import IdentitySchemas
from ory_kratos_client.model.identity_state import IdentityState
from ory_kratos_client.model.identity_with_credentials import IdentityWithCredentials
from ory_kratos_client.model.identity_with_credentials_oidc import IdentityWithCredentialsOidc
from ory_kratos_client.model.identity_with_credentials_oidc_config import IdentityWithCredentialsOidcConfig
from ory_kratos_client.model.identity_with_credentials_oidc_config_provider import IdentityWithCredentialsOidcConfigProvider
from ory_kratos_client.model.identity_with_credentials_password import IdentityWithCredentialsPassword
from ory_kratos_client.model.identity_with_credentials_password_config import IdentityWithCredentialsPasswordConfig
from ory_kratos_client.model.is_alive200_response import IsAlive200Response
from ory_kratos_client.model.is_ready503_response import IsReady503Response
from ory_kratos_client.model.json_patch import JsonPatch
from ory_kratos_client.model.json_patch_document import JsonPatchDocument
from ory_kratos_client.model.login_flow import LoginFlow
from ory_kratos_client.model.logout_flow import LogoutFlow
from ory_kratos_client.model.message import Message
from ory_kratos_client.model.message_dispatch import MessageDispatch
from ory_kratos_client.model.needs_privileged_session_error import NeedsPrivilegedSessionError
from ory_kratos_client.model.null_duration import NullDuration
from ory_kratos_client.model.o_auth2_client import OAuth2Client
from ory_kratos_client.model.o_auth2_consent_request_open_id_connect_context import OAuth2ConsentRequestOpenIDConnectContext
from ory_kratos_client.model.o_auth2_login_request import OAuth2LoginRequest
from ory_kratos_client.model.pagination import Pagination
from ory_kratos_client.model.patch_identities_body import PatchIdentitiesBody
from ory_kratos_client.model.perform_native_logout_body import PerformNativeLogoutBody
from ory_kratos_client.model.recovery_code_for_identity import RecoveryCodeForIdentity
from ory_kratos_client.model.recovery_flow import RecoveryFlow
from ory_kratos_client.model.recovery_flow_state import RecoveryFlowState
from ory_kratos_client.model.recovery_identity_address import RecoveryIdentityAddress
from ory_kratos_client.model.recovery_link_for_identity import RecoveryLinkForIdentity
from ory_kratos_client.model.registration_flow import RegistrationFlow
from ory_kratos_client.model.self_service_flow_expired_error import SelfServiceFlowExpiredError
from ory_kratos_client.model.session import Session
from ory_kratos_client.model.session_authentication_method import SessionAuthenticationMethod
from ory_kratos_client.model.session_authentication_methods import SessionAuthenticationMethods
from ory_kratos_client.model.session_device import SessionDevice
from ory_kratos_client.model.settings_flow import SettingsFlow
from ory_kratos_client.model.settings_flow_state import SettingsFlowState
from ory_kratos_client.model.successful_code_exchange_response import SuccessfulCodeExchangeResponse
from ory_kratos_client.model.successful_native_login import SuccessfulNativeLogin
from ory_kratos_client.model.successful_native_registration import SuccessfulNativeRegistration
from ory_kratos_client.model.token_pagination import TokenPagination
from ory_kratos_client.model.token_pagination_headers import TokenPaginationHeaders
from ory_kratos_client.model.ui_container import UiContainer
from ory_kratos_client.model.ui_node import UiNode
from ory_kratos_client.model.ui_node_anchor_attributes import UiNodeAnchorAttributes
from ory_kratos_client.model.ui_node_attributes import UiNodeAttributes
from ory_kratos_client.model.ui_node_image_attributes import UiNodeImageAttributes
from ory_kratos_client.model.ui_node_input_attributes import UiNodeInputAttributes
from ory_kratos_client.model.ui_node_meta import UiNodeMeta
from ory_kratos_client.model.ui_node_script_attributes import UiNodeScriptAttributes
from ory_kratos_client.model.ui_node_text_attributes import UiNodeTextAttributes
from ory_kratos_client.model.ui_nodes import UiNodes
from ory_kratos_client.model.ui_text import UiText
from ory_kratos_client.model.ui_texts import UiTexts
from ory_kratos_client.model.update_identity_body import UpdateIdentityBody
from ory_kratos_client.model.update_login_flow_body import UpdateLoginFlowBody
from ory_kratos_client.model.update_login_flow_with_lookup_secret_method import UpdateLoginFlowWithLookupSecretMethod
from ory_kratos_client.model.update_login_flow_with_oidc_method import UpdateLoginFlowWithOidcMethod
from ory_kratos_client.model.update_login_flow_with_password_method import UpdateLoginFlowWithPasswordMethod
from ory_kratos_client.model.update_login_flow_with_totp_method import UpdateLoginFlowWithTotpMethod
from ory_kratos_client.model.update_login_flow_with_web_authn_method import UpdateLoginFlowWithWebAuthnMethod
from ory_kratos_client.model.update_recovery_flow_body import UpdateRecoveryFlowBody
from ory_kratos_client.model.update_recovery_flow_with_code_method import UpdateRecoveryFlowWithCodeMethod
from ory_kratos_client.model.update_recovery_flow_with_link_method import UpdateRecoveryFlowWithLinkMethod
from ory_kratos_client.model.update_registration_flow_body import UpdateRegistrationFlowBody
from ory_kratos_client.model.update_registration_flow_with_oidc_method import UpdateRegistrationFlowWithOidcMethod
from ory_kratos_client.model.update_registration_flow_with_password_method import UpdateRegistrationFlowWithPasswordMethod
from ory_kratos_client.model.update_registration_flow_with_web_authn_method import UpdateRegistrationFlowWithWebAuthnMethod
from ory_kratos_client.model.update_settings_flow_body import UpdateSettingsFlowBody
from ory_kratos_client.model.update_settings_flow_with_lookup_method import UpdateSettingsFlowWithLookupMethod
from ory_kratos_client.model.update_settings_flow_with_oidc_method import UpdateSettingsFlowWithOidcMethod
from ory_kratos_client.model.update_settings_flow_with_password_method import UpdateSettingsFlowWithPasswordMethod
from ory_kratos_client.model.update_settings_flow_with_profile_method import UpdateSettingsFlowWithProfileMethod
from ory_kratos_client.model.update_settings_flow_with_totp_method import UpdateSettingsFlowWithTotpMethod
from ory_kratos_client.model.update_settings_flow_with_web_authn_method import UpdateSettingsFlowWithWebAuthnMethod
from ory_kratos_client.model.update_verification_flow_body import UpdateVerificationFlowBody
from ory_kratos_client.model.update_verification_flow_with_code_method import UpdateVerificationFlowWithCodeMethod
from ory_kratos_client.model.update_verification_flow_with_link_method import UpdateVerificationFlowWithLinkMethod
from ory_kratos_client.model.verifiable_identity_address import VerifiableIdentityAddress
from ory_kratos_client.model.verification_flow import VerificationFlow
from ory_kratos_client.model.verification_flow_state import VerificationFlowState
from ory_kratos_client.model.version import Version
