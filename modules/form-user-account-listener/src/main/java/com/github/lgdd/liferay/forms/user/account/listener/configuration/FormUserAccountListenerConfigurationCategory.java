package com.github.lgdd.liferay.forms.user.account.listener.configuration;

import com.liferay.configuration.admin.category.ConfigurationCategory;
import org.osgi.service.component.annotations.Component;

/**
 * Add a new section 'Demo' and a new category 'Forms Listeners' under System Settings.
 */
@Component(
    immediate = true,
    service = ConfigurationCategory.class
)
public class FormUserAccountListenerConfigurationCategory
    implements ConfigurationCategory {

  @Override
  public String getCategoryKey() {

    return CATEGORY_KEY;
  }

  @Override
  public String getCategorySection() {

    return CATEGORY_SECTION;
  }

  public static final String CATEGORY_KEY = "forms-listeners";
  public static final String CATEGORY_SECTION = "demo";

}
