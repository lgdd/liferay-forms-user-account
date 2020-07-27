package com.github.lgdd.liferay.forms.user.account.listener.configuration;

import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(
    category = FormUserAccountListenerConfigurationCategory.CATEGORY_KEY,
    scope = ExtendedObjectClassDefinition.Scope.SYSTEM
)
@Meta.OCD(
    id = FormUserAccountListenerConfiguration.PID,
    localization = "content/Language",
    name = "form-user-account-listener-config-name"
)
public interface FormUserAccountListenerConfiguration {

  @Meta.AD(
      name = "form-user-account-listener-form-id",
      description = "You can find this information after creating a form under 'Content & Data > Forms' in a site",
      required = false
  )
  public long formId();

  public static final String PID = "com.github.lgdd.liferay.forms.user.account.listener.configuration.FormUserAccountListenerConfiguration";

}
