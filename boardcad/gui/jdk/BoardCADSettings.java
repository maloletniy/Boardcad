package boardcad.gui.jdk;

import boardcad.settings.CategorizedSettings;
import boardcad.settings.Settings;

class BoardCADSettings extends CategorizedSettings {

    static private BoardCADSettings mInstance = null;

    protected BoardCADSettings() {
        super();
        Settings.SettingChangedCallback defaultCallback = new Settings.SettingChangedCallback() {

            public void onSettingChanged(final Object obj) {
                BoardCAD.getInstance().onSettingsChanged();
            }

        };
        setDefaultCallback(defaultCallback);

    }

    public static BoardCADSettings getInstance() {
        if (mInstance == null) {
            mInstance = new BoardCADSettings();
        }
        return mInstance;
    }

};
