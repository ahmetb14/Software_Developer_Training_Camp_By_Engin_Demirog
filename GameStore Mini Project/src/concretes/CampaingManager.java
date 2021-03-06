package concretes;

import abstracts.CampaingService;
import entities.Campaing;
import entities.Game;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {

		System.out.println(campaing.getCampaingName() + " => Sisteme Eklendi!");

	}

	@Override
	public void update(Campaing campaing) {

		System.out.println(campaing.getCampaingName() + " => Kampanyası Sistemde Güncellendi!");

	}

	@Override
	public void delete(Campaing campaing) {

		System.out.println(campaing.getCampaingName() + " => Kampanyası Sistemden Kaldırıldı!");

	}

	@Override
	public void use(Campaing campaing, Game game) {

		double result = game.getPrice() - (game.getPrice() / campaing.getCampaingDiscountRate() * 100);
		System.out.println("=> Kampanya Sisteme Uygulandı! Güncel Fiyat: " + result + " " + game.getName());
	}

}
