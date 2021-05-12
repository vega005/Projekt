package com.example.Projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Component
public class Start {

    GameRepo gameRepo;

    @Autowired
    public Start(GameRepo gameRepo) {
        this.gameRepo = gameRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    void run(){

        GameItem game1 = new GameItem("Mass Effect", Type.SCIENCE_FICTION, "BioWare", "Fabuła gry " +
                "osadzona jest w Drodze Mlecznej w 2183 roku, kiedy ludzkość poznała już tajniki lotów międzygwiezdnych, " +
                "możliwych dzięki urządzeniom znanym jako przekaźniki masy, będącymi pozostałością po wymarłej rasie " +
                "obcych – protean." );
        gameRepo.save(game1);


        GameItem game2 = new GameItem("Unreal Tournament", Type.FPP, " Epic Games", "Unreal Tournament " +
                "to strzelanka pierwszoosobowa na arenie, w której głównym celem są bezpośrednie pojedynki na śmierć i życie " +
                "w trybie wieloosobowym. Kampania dla pojedynczego gracza to seria meczy na arenie rozgrywanych z botami, w " +
                "których gracz rywalizuje o tytuł Grand Championa.");
        gameRepo.save(game2);

        GameItem game3 = new GameItem("Wiedzmin", Type.RPG, "CD Projekt Red", "Wiedźmin" +
                "jest fabularną grą akcji z otwartym światem. Gracz steruje postacią Geralta z Rivii z perspektywy trzeciej " +
                "osoby. W niektórych fragmentach gry gracz wciela się w postać Ciri. Poza poruszaniem się po lądzie można " +
                "także pływać zarówno na jak i pod powierzchnią wody.");
        gameRepo.save(game3);

        GameItem game4 = new GameItem("Dying Light", Type.HORROR, "Techland", "Głównym bohaterem gry " +
                "jest Kyle Crane, który na polecenie fikcyjnej organizacji GRE (Globalny Resort Epidemiologiczny) trafia do " +
                "miasta Harran. Na miejscu okazuje się, że mieszkańcy zostali zarażeni chorobą, która zmieniła ich w zombie. " +
                "Z opresji ratują go nieznani wybawcy, jak się okazuje należący do grupy ocalałych. Celem bohatera staje się " +
                "odnalezienie pliku zawierającego informacje o potencjalnym lekarstwie.");
        gameRepo.save(game4);

        GameItem game5 = new GameItem("Syberia ", Type.ADVENTURE, "Microïds", "Gracz kieruje amerykańską " +
                "prawniczką Kate Walker, która odwiedza kolejne lokacje, prowadzi rozmowy z napotkanymi postaciami, odnajduje " +
                "potrzebne przedmioty i rozwiązuje zagadki logiczne. W czasie dialogów z postaciami gracz ma do wyboru różne " +
                "tematy rozmów. Bohaterka posługuje się też telefonem komórkowym, aby wykonywać rozmowy lub odbierać połączenia.");
        gameRepo.save(game5);



    }
}
