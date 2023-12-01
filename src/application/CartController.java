package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CartController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	static int counter;
	public String total;

	List<TextField> name = new ArrayList<TextField>();
	List<TextField> totalPrice = new ArrayList<TextField>();
	List<ImageView> image = new ArrayList<ImageView>();
	List<TextField> count = new ArrayList<TextField>();
	List<Label> labels = new ArrayList<Label>();

	@FXML
	private Label aisleLabel0;
	@FXML
	private Label aisleLabel1;
	@FXML
	private Label aisleLabel2;
	@FXML
	private Label aisleLabel3;
	@FXML
	private Label aisleLabel4;
	@FXML
	private Label aisleLabel5;

	@FXML
	private TextField prodNm0;
	@FXML
	private TextField prodNm1;
	@FXML
	private TextField prodNm2;
	@FXML
	private TextField prodNm3;
	@FXML
	private TextField prodNm4;
	@FXML
	private TextField prodNm5;
	@FXML
	private TextField prodNm6;
	@FXML
	private TextField prodNm7;
	@FXML
	private TextField prodNm8;
	@FXML
	private TextField prodNm9;
	@FXML
	private TextField prodNm10;
	@FXML
	private TextField prodNm11;
	@FXML
	private TextField prodNm12;
	@FXML
	private TextField prodNm13;
	@FXML
	private TextField prodNm14;
	@FXML
	private TextField prodNm15;
	@FXML
	private TextField prodNm16;
	@FXML
	private TextField prodNm17;
	@FXML
	private TextField prodNm18;
	@FXML
	private TextField prodNm19;
	@FXML
	private TextField prodNm20;
	@FXML
	private TextField prodNm21;
	@FXML
	private TextField prodNm22;
	@FXML
	private TextField prodNm23;

	@FXML
	private TextField count0;
	@FXML
	private TextField count1;
	@FXML
	private TextField count2;
	@FXML
	private TextField count3;
	@FXML
	private TextField count4;
	@FXML
	private TextField count5;
	@FXML
	private TextField count6;
	@FXML
	private TextField count7;
	@FXML
	private TextField count8;
	@FXML
	private TextField count9;
	@FXML
	private TextField count10;
	@FXML
	private TextField count11;
	@FXML
	private TextField count12;
	@FXML
	private TextField count13;
	@FXML
	private TextField count14;
	@FXML
	private TextField count15;
	@FXML
	private TextField count16;
	@FXML
	private TextField count17;
	@FXML
	private TextField count18;
	@FXML
	private TextField count19;
	@FXML
	private TextField count20;
	@FXML
	private TextField count21;
	@FXML
	private TextField count22;
	@FXML
	private TextField count23;

	@FXML
	private TextField price0;
	@FXML
	private TextField price1;
	@FXML
	private TextField price2;
	@FXML
	private TextField price3;
	@FXML
	private TextField price4;
	@FXML
	private TextField price5;
	@FXML
	private TextField price6;
	@FXML
	private TextField price7;
	@FXML
	private TextField price8;
	@FXML
	private TextField price9;
	@FXML
	private TextField price10;
	@FXML
	private TextField price11;
	@FXML
	private TextField price12;
	@FXML
	private TextField price13;
	@FXML
	private TextField price14;
	@FXML
	private TextField price15;
	@FXML
	private TextField price16;
	@FXML
	private TextField price17;
	@FXML
	private TextField price18;
	@FXML
	private TextField price19;
	@FXML
	private TextField price20;
	@FXML
	private TextField price21;
	@FXML
	private TextField price22;
	@FXML
	private TextField price23;

	@FXML
	private ImageView img0;
	@FXML
	private ImageView img1;
	@FXML
	private ImageView img2;
	@FXML
	private ImageView img3;
	@FXML
	private ImageView img4;
	@FXML
	private ImageView img5;
	@FXML
	private ImageView img6;
	@FXML
	private ImageView img7;
	@FXML
	private ImageView img8;
	@FXML
	private ImageView img9;
	@FXML
	private ImageView img10;
	@FXML
	private ImageView img11;
	@FXML
	private ImageView img12;
	@FXML
	private ImageView img13;
	@FXML
	private ImageView img14;
	@FXML
	private ImageView img15;
	@FXML
	private ImageView img16;
	@FXML
	private ImageView img17;
	@FXML
	private ImageView img18;
	@FXML
	private ImageView img19;
	@FXML
	private ImageView img20;
	@FXML
	private ImageView img21;
	@FXML
	private ImageView img22;
	@FXML
	private ImageView img23;

	public void setup() {
		labels.add(aisleLabel0);
		labels.add(aisleLabel1);
		labels.add(aisleLabel2);
		labels.add(aisleLabel3);
		labels.add(aisleLabel4);
		labels.add(aisleLabel5);

		image.add(img0);
		image.add(img1);
		image.add(img2);
		image.add(img3);
		image.add(img4);
		image.add(img5);
		image.add(img6);
		image.add(img7);
		image.add(img8);
		image.add(img9);
		image.add(img10);
		image.add(img11);
		image.add(img12);
		image.add(img13);
		image.add(img14);
		image.add(img15);
		image.add(img16);
		image.add(img17);
		image.add(img18);
		image.add(img19);
		image.add(img20);
		image.add(img21);
		image.add(img22);
		image.add(img23);

		name.add(prodNm0);
		name.add(prodNm1);
		name.add(prodNm2);
		name.add(prodNm3);
		name.add(prodNm4);
		name.add(prodNm5);
		name.add(prodNm6);
		name.add(prodNm7);
		name.add(prodNm8);
		name.add(prodNm9);
		name.add(prodNm10);
		name.add(prodNm11);
		name.add(prodNm12);
		name.add(prodNm13);
		name.add(prodNm14);
		name.add(prodNm15);
		name.add(prodNm16);
		name.add(prodNm17);
		name.add(prodNm18);
		name.add(prodNm19);
		name.add(prodNm20);
		name.add(prodNm21);
		name.add(prodNm22);
		name.add(prodNm23);

		totalPrice.add(price0);
		totalPrice.add(price1);
		totalPrice.add(price2);
		totalPrice.add(price3);
		totalPrice.add(price4);
		totalPrice.add(price5);
		totalPrice.add(price6);
		totalPrice.add(price7);
		totalPrice.add(price8);
		totalPrice.add(price9);
		totalPrice.add(price10);
		totalPrice.add(price11);
		totalPrice.add(price12);
		totalPrice.add(price13);
		totalPrice.add(price14);
		totalPrice.add(price15);
		totalPrice.add(price16);
		totalPrice.add(price17);
		totalPrice.add(price18);
		totalPrice.add(price19);
		totalPrice.add(price20);
		totalPrice.add(price21);
		totalPrice.add(price22);
		totalPrice.add(price23);

		count.add(count0);
		count.add(count1);
		count.add(count2);
		count.add(count3);
		count.add(count4);
		count.add(count5);
		count.add(count6);
		count.add(count7);
		count.add(count8);
		count.add(count9);
		count.add(count10);
		count.add(count11);
		count.add(count12);
		count.add(count13);
		count.add(count14);
		count.add(count15);
		count.add(count16);
		count.add(count17);
		count.add(count18);
		count.add(count19);
		count.add(count20);
		count.add(count21);
		count.add(count22);
		count.add(count23);

	}

	public void displayCart() throws FileNotFoundException {
		displayAisleLabel();
		displayContent();

	}

	public void displayAisleLabel() {
		setup();
		Cart shoppingCart = Cart.getInstance();
		List<Integer> aisles = shoppingCart.getAisles();
		aisleLabel0.setText("Aisle " + aisles.get(0));
		for (int i = 0; i < aisles.size() - 1; i++) {
			if (shoppingCart.getCountMap(aisles.get(i)).size() > 4) {
				labels.get(i + 2).setText("Aisle " + aisles.get(i + 1));
			} else {
				labels.get(i + 1).setText("Aisle " + aisles.get(i + 1));
			}
		}
	}

	public void displayContent() throws FileNotFoundException {
		Cart shoppingCart = Cart.getInstance();
		List<Integer> aisles = shoppingCart.getAisles();
		int k = 0;
		for (int i = 0; i < aisles.size(); i++) {
			int elements = shoppingCart.getCountMap(aisles.get(i)).size();
			for (int j = 0; j < elements; j++) {
				List<String> prodNames = shoppingCart.getProductNames(aisles.get(i));
				InputStream stream = new FileInputStream((System.getProperty("user.dir") + "/src/assets/"
						+ shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getProduct().getImage()));
				Image img = new Image(stream);
				String nm = shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getProduct().getName();
				Integer cnt = shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getQuantity();
				Double price = shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getQuantity()
						* shoppingCart.getCountMap(aisles.get(i)).get(prodNames.get(j)).getProduct().getPrice();
				counter = ((i * 4) + j + (4 * k));
				image.get(counter).setImage(img);
				name.get(counter).setText(nm);
				count.get(counter).setText(String.valueOf(cnt) + "Units");
				totalPrice.get(counter).setText("$" + String.valueOf(price));

			}
			if (elements > 4) {
				k++;
			}
		}
	}

	public void switchToScene1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void switchToCheckout(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("checkout.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public String getTotalCost() {
		Cart shoppingCart = Cart.getInstance();
		total = String.valueOf(shoppingCart.calculateTotal());
		return total;
	}

}
