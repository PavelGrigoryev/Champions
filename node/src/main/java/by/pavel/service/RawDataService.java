package by.pavel.service;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface RawDataService {

    void processTextMessage(Update update);

}
