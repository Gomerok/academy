package by.academy.deal;

public class DealMenu {

	private Deal deal;

	public DealMenu(Deal deal) {
		super();
		this.deal = deal;
	}

	public void dealMenu() {

		int choiceMenu;
		do {
			System.out.println("Меню:\n" + "Для ввода данных buyer введите 1\n" + "Для ввода данных seller введите 2\n"
					+ "Для добавления продукта введите 3\n" + "Для удаления продукта введите 4\n"
					+ "Для просмотра выбранных продуктов введите 5\n" + "Для просмотра дедлайна сделки введите 6\n"
					+ "Для просмотра информации о seller и buyer введите 7\n" + "Для вывода чека введите 8\n"
					+ "Чтобы выйти введите 9\n");
			choiceMenu = deal.intValidate();
			switch (choiceMenu) {
			case 1:
				deal.initializationUser(deal.getBuyer());
				break;
			case 2:
				deal.initializationUser(deal.getSeller());
				break;
			case 3:
				deal.addProduct(deal.createProducts());
				break;
			case 4:
				deal.removeProducts();
				break;
			case 5:
				deal.showProducts();
				break;
			case 6:
				deal.printdeadlineDate();
				break;
			case 7:
				System.out.println("Buyer: ");
				deal.getBuyer().getUserData();
				System.out.println("Seller: ");
				deal.getSeller().getUserData();
				break;
			case 8:
				System.out.println(deal.getDate().getDayOfMonth() + "." + deal.getDate().getMonthValue() + "."
						+ deal.getDate().getYear());
				System.out.println("Bill:");
				for (Product p : deal.getProducts()) {
					System.out.println(p.getName() + " price: " + p.calcPrice());
				}

				System.out.println("-------------------------");
				System.out.println(deal.calcFullPrice());

				break;
			}
		} while (choiceMenu != 9);

	}

}
