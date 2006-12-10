package enginuity.logger.profile;

import enginuity.logger.definition.EcuData;
import enginuity.logger.definition.EcuDataConvertor;

public interface UserProfile {

    String getSerialPort();

    boolean contains(EcuData ecuData);

    boolean isSelectedOnLiveDataTab(EcuData ecuData);

    boolean isSelectedOnGraphTab(EcuData ecuData);

    boolean isSelectedOnDashTab(EcuData ecuData);

    EcuDataConvertor getSelectedConvertor(EcuData ecuData);

    byte[] getBytes();
}
