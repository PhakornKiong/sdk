// Code generated by go-swagger; DO NOT EDIT.

package models

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"

	"github.com/go-openapi/errors"
	"github.com/go-openapi/strfmt"
	"github.com/go-openapi/swag"
	"github.com/go-openapi/validate"
)

// RecoveryAddress recovery address
//
// swagger:model RecoveryAddress
type RecoveryAddress struct {

	// id
	// Required: true
	// Format: uuid4
	ID *UUID `json:"id"`

	// value
	// Required: true
	Value *string `json:"value"`

	// via
	// Required: true
	Via *RecoveryAddressType `json:"via"`
}

// Validate validates this recovery address
func (m *RecoveryAddress) Validate(formats strfmt.Registry) error {
	var res []error

	if err := m.validateID(formats); err != nil {
		res = append(res, err)
	}

	if err := m.validateValue(formats); err != nil {
		res = append(res, err)
	}

	if err := m.validateVia(formats); err != nil {
		res = append(res, err)
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}

func (m *RecoveryAddress) validateID(formats strfmt.Registry) error {

	if err := validate.Required("id", "body", m.ID); err != nil {
		return err
	}

	if err := validate.Required("id", "body", m.ID); err != nil {
		return err
	}

	if m.ID != nil {
		if err := m.ID.Validate(formats); err != nil {
			if ve, ok := err.(*errors.Validation); ok {
				return ve.ValidateName("id")
			}
			return err
		}
	}

	return nil
}

func (m *RecoveryAddress) validateValue(formats strfmt.Registry) error {

	if err := validate.Required("value", "body", m.Value); err != nil {
		return err
	}

	return nil
}

func (m *RecoveryAddress) validateVia(formats strfmt.Registry) error {

	if err := validate.Required("via", "body", m.Via); err != nil {
		return err
	}

	if err := validate.Required("via", "body", m.Via); err != nil {
		return err
	}

	if m.Via != nil {
		if err := m.Via.Validate(formats); err != nil {
			if ve, ok := err.(*errors.Validation); ok {
				return ve.ValidateName("via")
			}
			return err
		}
	}

	return nil
}

// ContextValidate validate this recovery address based on the context it is used
func (m *RecoveryAddress) ContextValidate(ctx context.Context, formats strfmt.Registry) error {
	var res []error

	if err := m.contextValidateID(ctx, formats); err != nil {
		res = append(res, err)
	}

	if err := m.contextValidateVia(ctx, formats); err != nil {
		res = append(res, err)
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}

func (m *RecoveryAddress) contextValidateID(ctx context.Context, formats strfmt.Registry) error {

	if m.ID != nil {
		if err := m.ID.ContextValidate(ctx, formats); err != nil {
			if ve, ok := err.(*errors.Validation); ok {
				return ve.ValidateName("id")
			}
			return err
		}
	}

	return nil
}

func (m *RecoveryAddress) contextValidateVia(ctx context.Context, formats strfmt.Registry) error {

	if m.Via != nil {
		if err := m.Via.ContextValidate(ctx, formats); err != nil {
			if ve, ok := err.(*errors.Validation); ok {
				return ve.ValidateName("via")
			}
			return err
		}
	}

	return nil
}

// MarshalBinary interface implementation
func (m *RecoveryAddress) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *RecoveryAddress) UnmarshalBinary(b []byte) error {
	var res RecoveryAddress
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
