=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.0.1-alpha.184
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OryClient::ReadApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ReadApi' do
  before do
    # run before each test
    @api_instance = OryClient::ReadApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ReadApi' do
    it 'should create an instance of ReadApi' do
      expect(@api_instance).to be_instance_of(OryClient::ReadApi)
    end
  end

  # unit tests for get_check
  # Check a relation tuple
  # To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
  # @param [Hash] opts the optional parameters
  # @option opts [String] :namespace Namespace of the Relation Tuple
  # @option opts [String] :object Object of the Relation Tuple
  # @option opts [String] :relation Relation of the Relation Tuple
  # @option opts [String] :subject_id SubjectID of the Relation Tuple
  # @option opts [String] :subject_set_namespace Namespace of the Subject Set
  # @option opts [String] :subject_set_object Object of the Subject Set
  # @option opts [String] :subject_set_relation Relation of the Subject Set
  # @option opts [Integer] :max_depth 
  # @return [GetCheckResponse]
  describe 'get_check test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_expand
  # Expand a Relation Tuple
  # Use this endpoint to expand a relation tuple.
  # @param namespace Namespace of the Subject Set
  # @param object Object of the Subject Set
  # @param relation Relation of the Subject Set
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :max_depth 
  # @return [ExpandTree]
  describe 'get_expand test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_relation_tuples
  # Query relation tuples
  # Get all relation tuples that match the query. Only the namespace field is required.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :page_token 
  # @option opts [Integer] :page_size 
  # @option opts [String] :namespace Namespace of the Relation Tuple
  # @option opts [String] :object Object of the Relation Tuple
  # @option opts [String] :relation Relation of the Relation Tuple
  # @option opts [String] :subject_id SubjectID of the Relation Tuple
  # @option opts [String] :subject_set_namespace Namespace of the Subject Set
  # @option opts [String] :subject_set_object Object of the Subject Set
  # @option opts [String] :subject_set_relation Relation of the Subject Set
  # @return [GetRelationTuplesResponse]
  describe 'get_relation_tuples test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_check
  # Check a relation tuple
  # To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :max_depth 
  # @option opts [RelationQuery] :relation_query 
  # @return [GetCheckResponse]
  describe 'post_check test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
