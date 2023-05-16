"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more.   # noqa: E501

    The version of the OpenAPI document: v0.13.2
    Contact: office@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_kratos_client
from ory_kratos_client.model.session_authentication_method import SessionAuthenticationMethod
globals()['SessionAuthenticationMethod'] = SessionAuthenticationMethod
from ory_kratos_client.model.session_authentication_methods import SessionAuthenticationMethods


class TestSessionAuthenticationMethods(unittest.TestCase):
    """SessionAuthenticationMethods unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSessionAuthenticationMethods(self):
        """Test SessionAuthenticationMethods"""
        # FIXME: construct object with mandatory attributes with example values
        # model = SessionAuthenticationMethods()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
