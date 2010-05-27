//============================================================================
//
// Copyright (C) 2009 Lukas Frena
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//============================================================================

package net.sf.eclipsecs.core.transformer.ctransformerclasses;

import net.sf.eclipsecs.core.transformer.FormatterConfiguration;
import net.sf.eclipsecs.core.transformer.CTransformationClass;

/**
 * Wrapperclass for converting the checkstyle-rule RequireThis to appropriate
 * eclipse-formatter-rules.
 * 
 * @author Lukas Frena
 */
public class RequireThisTransformer extends CTransformationClass {
    @Override
    public FormatterConfiguration transformRule() {
        useGlobalSetting(
            "sp_cleanup.always_use_this_for_non_static_field_access", "true");
        useGlobalSetting("sp_cleanup.use_this_for_non_static_field_access",
            "true");
        useGlobalSetting(
            "sp_cleanup.always_use_this_for_non_static_method_access", "true");
        useGlobalSetting(
            "sp_cleanup.use_this_for_non_static_method_access_only_if_necessary",
            "false");
        useGlobalSetting("sp_cleanup.use_this_for_non_static_method_access",
            "true");
        useGlobalSetting(
            "sp_cleanup.use_this_for_non_static_field_access_only_if_necessary",
            "false");
        return getFormatterSetting();
    }
}