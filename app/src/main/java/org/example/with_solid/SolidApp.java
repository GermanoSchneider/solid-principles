package org.example.with_solid;

import java.awt.Color;
import java.math.BigDecimal;

public class SolidApp {

    public static void main(String[] args) {

      DeviceColor wiredColors = new DeviceColor(Color.BLACK, Color.BLACK);
      DeviceColor wirelessColors = new DeviceColor(Color.GREEN, Color.GRAY);

      Device wired = new WiredDevice("Keyboard", new BigDecimal(100), wiredColors);
      Device wireless = new WiredDevice("Mouse", new BigDecimal(50), wirelessColors);

      DeviceService deviceService = new DeviceServiceImpl();
      WirelessDeviceService wirelessDeviceService = new WirelessImplService();

      deviceService.turnOn(wired);
      wirelessDeviceService.turnOn(wireless);
    }
}
