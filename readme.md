# Liferay Forms User Account

Proof of concept demonstrating how
[*Liferay Forms*](https://learn.liferay.com/dxp/7.x/en/process-automation/forms/user-guide/introduction-to-forms.html)
could be used for a user account creation process using
[`ModelListener`](https://learn.liferay.com/dxp/7.x/en/liferay-internals/extending-liferay/creating-a-model-listener.html?highlight=modellistener).

## Installation

- Deploy this module in your portal instance under `$LIFERAY_HOME/deploy` or `$LIFERAY_HOME/osgi/modules`.

or

- Clone this repo.
- Run `docker-compose up --build`.
 
## Configuration

- [Create a form](https://learn.liferay.com/dxp/7.x/en/process-automation/forms/user-guide/creating-forms.html)
with `firstname`, `lastname` and `email` fields (`middlename` is optional but supported).
- [Apply a *Single Approver* workflow to it](https://learn.liferay.com/dxp/7.x/en/process-automation/workflow/user-guide/activating-workflow.html#forms).
- Copy & paste the form ID in `Control Panel > System Settings > Demo - Forms Listeners`

## Usage

- Make a form submission.
- You should see a new inactive user under `Control Panel > Users > Users & Organizations`,
and a notification on your user profile to approve the form.
- Approve the form.
- The new user should be active now.

## License

[MIT](LICENSE)
