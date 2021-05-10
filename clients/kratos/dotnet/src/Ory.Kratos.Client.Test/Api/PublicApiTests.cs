/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.15
 * Contact: hi@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Ory.Kratos.Client.Client;
using Ory.Kratos.Client.Api;
// uncomment below to import models
//using Ory.Kratos.Client.Model;

namespace Ory.Kratos.Client.Test.Api
{
    /// <summary>
    ///  Class for testing PublicApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class PublicApiTests : IDisposable
    {
        private PublicApi instance;

        public PublicApiTests()
        {
            instance = new PublicApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of PublicApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' PublicApi
            //Assert.IsType<PublicApi>(instance);
        }

        /// <summary>
        /// Test GetSchema
        /// </summary>
        [Fact]
        public void GetSchemaTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetSchema(id);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test GetSelfServiceError
        /// </summary>
        [Fact]
        public void GetSelfServiceErrorTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string error = null;
            //var response = instance.GetSelfServiceError(error);
            //Assert.IsType<KratosErrorContainer>(response);
        }

        /// <summary>
        /// Test GetSelfServiceLoginFlow
        /// </summary>
        [Fact]
        public void GetSelfServiceLoginFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetSelfServiceLoginFlow(id);
            //Assert.IsType<KratosLoginFlow>(response);
        }

        /// <summary>
        /// Test GetSelfServiceRecoveryFlow
        /// </summary>
        [Fact]
        public void GetSelfServiceRecoveryFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetSelfServiceRecoveryFlow(id);
            //Assert.IsType<KratosRecoveryFlow>(response);
        }

        /// <summary>
        /// Test GetSelfServiceRegistrationFlow
        /// </summary>
        [Fact]
        public void GetSelfServiceRegistrationFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetSelfServiceRegistrationFlow(id);
            //Assert.IsType<KratosRegistrationFlow>(response);
        }

        /// <summary>
        /// Test GetSelfServiceSettingsFlow
        /// </summary>
        [Fact]
        public void GetSelfServiceSettingsFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetSelfServiceSettingsFlow(id);
            //Assert.IsType<KratosSettingsFlow>(response);
        }

        /// <summary>
        /// Test GetSelfServiceVerificationFlow
        /// </summary>
        [Fact]
        public void GetSelfServiceVerificationFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.GetSelfServiceVerificationFlow(id);
            //Assert.IsType<KratosVerificationFlow>(response);
        }

        /// <summary>
        /// Test InitializeSelfServiceBrowserLogoutFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceBrowserLogoutFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.InitializeSelfServiceBrowserLogoutFlow();
        }

        /// <summary>
        /// Test InitializeSelfServiceLoginViaAPIFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceLoginViaAPIFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? refresh = null;
            //var response = instance.InitializeSelfServiceLoginViaAPIFlow(refresh);
            //Assert.IsType<KratosLoginFlow>(response);
        }

        /// <summary>
        /// Test InitializeSelfServiceLoginViaBrowserFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceLoginViaBrowserFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.InitializeSelfServiceLoginViaBrowserFlow();
        }

        /// <summary>
        /// Test InitializeSelfServiceRecoveryViaAPIFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceRecoveryViaAPIFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InitializeSelfServiceRecoveryViaAPIFlow();
            //Assert.IsType<KratosRecoveryFlow>(response);
        }

        /// <summary>
        /// Test InitializeSelfServiceRecoveryViaBrowserFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceRecoveryViaBrowserFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.InitializeSelfServiceRecoveryViaBrowserFlow();
        }

        /// <summary>
        /// Test InitializeSelfServiceRegistrationViaAPIFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceRegistrationViaAPIFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InitializeSelfServiceRegistrationViaAPIFlow();
            //Assert.IsType<KratosRegistrationFlow>(response);
        }

        /// <summary>
        /// Test InitializeSelfServiceRegistrationViaBrowserFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceRegistrationViaBrowserFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.InitializeSelfServiceRegistrationViaBrowserFlow();
        }

        /// <summary>
        /// Test InitializeSelfServiceSettingsViaAPIFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceSettingsViaAPIFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InitializeSelfServiceSettingsViaAPIFlow();
            //Assert.IsType<KratosSettingsFlow>(response);
        }

        /// <summary>
        /// Test InitializeSelfServiceSettingsViaBrowserFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceSettingsViaBrowserFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.InitializeSelfServiceSettingsViaBrowserFlow();
        }

        /// <summary>
        /// Test InitializeSelfServiceVerificationViaAPIFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceVerificationViaAPIFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InitializeSelfServiceVerificationViaAPIFlow();
            //Assert.IsType<KratosVerificationFlow>(response);
        }

        /// <summary>
        /// Test InitializeSelfServiceVerificationViaBrowserFlow
        /// </summary>
        [Fact]
        public void InitializeSelfServiceVerificationViaBrowserFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.InitializeSelfServiceVerificationViaBrowserFlow();
        }

        /// <summary>
        /// Test RevokeSession
        /// </summary>
        [Fact]
        public void RevokeSessionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //KratosRevokeSession kratosRevokeSession = null;
            //instance.RevokeSession(kratosRevokeSession);
        }

        /// <summary>
        /// Test SubmitSelfServiceLoginFlow
        /// </summary>
        [Fact]
        public void SubmitSelfServiceLoginFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string flow = null;
            //KratosSubmitSelfServiceLoginFlow kratosSubmitSelfServiceLoginFlow = null;
            //var response = instance.SubmitSelfServiceLoginFlow(flow, kratosSubmitSelfServiceLoginFlow);
            //Assert.IsType<KratosLoginViaApiResponse>(response);
        }

        /// <summary>
        /// Test SubmitSelfServiceRecoveryFlow
        /// </summary>
        [Fact]
        public void SubmitSelfServiceRecoveryFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string flow = null;
            //Object body = null;
            //instance.SubmitSelfServiceRecoveryFlow(flow, body);
        }

        /// <summary>
        /// Test SubmitSelfServiceRecoveryFlowWithLinkMethod
        /// </summary>
        [Fact]
        public void SubmitSelfServiceRecoveryFlowWithLinkMethodTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string token = null;
            //string flow = null;
            //KratosSubmitSelfServiceRecoveryFlowWithLinkMethod kratosSubmitSelfServiceRecoveryFlowWithLinkMethod = null;
            //instance.SubmitSelfServiceRecoveryFlowWithLinkMethod(token, flow, kratosSubmitSelfServiceRecoveryFlowWithLinkMethod);
        }

        /// <summary>
        /// Test SubmitSelfServiceRegistrationFlow
        /// </summary>
        [Fact]
        public void SubmitSelfServiceRegistrationFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string flow = null;
            //KratosSubmitSelfServiceRegistrationFlow kratosSubmitSelfServiceRegistrationFlow = null;
            //var response = instance.SubmitSelfServiceRegistrationFlow(flow, kratosSubmitSelfServiceRegistrationFlow);
            //Assert.IsType<KratosRegistrationViaApiResponse>(response);
        }

        /// <summary>
        /// Test SubmitSelfServiceSettingsFlow
        /// </summary>
        [Fact]
        public void SubmitSelfServiceSettingsFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string flow = null;
            //KratosSubmitSelfServiceSettingsFlow kratosSubmitSelfServiceSettingsFlow = null;
            //var response = instance.SubmitSelfServiceSettingsFlow(flow, kratosSubmitSelfServiceSettingsFlow);
            //Assert.IsType<KratosSettingsViaApiResponse>(response);
        }

        /// <summary>
        /// Test SubmitSelfServiceVerificationFlow
        /// </summary>
        [Fact]
        public void SubmitSelfServiceVerificationFlowTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string flow = null;
            //Object body = null;
            //instance.SubmitSelfServiceVerificationFlow(flow, body);
        }

        /// <summary>
        /// Test Whoami
        /// </summary>
        [Fact]
        public void WhoamiTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string cookie = null;
            //string authorization = null;
            //var response = instance.Whoami(cookie, authorization);
            //Assert.IsType<KratosSession>(response);
        }
    }
}
