package com.example.products_app.products;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(UUID.randomUUID(), "Apple iPhone 14",
                "The latest iPhone with cutting-edge technology.",
                999.99,
                "https://opsg-img-cdn-gl.heytapimg.com/epb/202406/26/IzcVfAu2kdJjoeYS.png"
        ));
        productList.add(new Product(UUID.randomUUID(), "Samsung Galaxy S23",
                "Samsung Galaxy S23 5G Enterprise Edition 5G Smartphone 128 GB 15.5 cm (6.1 Zoll) Phantom Black Android™ 13 Dual-SIM",
                849.99,
                "https://cdn.webshopapp.com/shops/319423/files/425837752/600x465x3/shieldcase-shieldcase-samsung-galaxy-s23-plus-sili.jpg"
        ));
        productList.add(new Product(UUID.randomUUID(), "Sony WH-1000XM5",
                "Premium noise-canceling wireless headphones.",
                399.99,
                "https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_93871544?x=536&y=402&format=jpg&quality=80&sp=yes&strip=yes&trim&ex=536&ey=402&align=center&resizesource&unsharp=1.5x1+0.7+0.02&cox=0&coy=0"
        ));
        productList.add(new Product(UUID.randomUUID(), "Dell XPS 13",
                "Compact and powerful laptop with an edge-to-edge display.",
                1299.99,
                "https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/notebooks/xps-notebooks/xps-13-9315/spi/blue/ng/notebook-xps-13-9315-blue-campaign-hero-504x350-ng.psd?fmt=jpg&wid=570&hei=400"
        ));
        productList.add(new Product(UUID.randomUUID(), "Fitbit Charge 5",
                "Advanced fitness tracker with GPS and health metrics.",
                149.95,
                "https://media.inf-shop.de/74503-large_default/fitbit-charge-5-schwarz-graphit.webp"
        ));
        productList.add(new Product(UUID.randomUUID(), "Canon EOS R50",
                "Lightweight mirrorless camera for stunning photography.",
                799.99,
                "https://harrisoncameras.co.uk/cdn/shop/files/5811C032AA.jpg?v=1720760684"
        ));
        productList.add(new Product(UUID.randomUUID(), "Nespresso Vertuo Next",
                "A compact coffee machine for barista-quality coffee at home.",
                199.99,
                "https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MP_137870123?x=536&y=402&format=jpg&quality=80&sp=yes&strip=yes&trim&ex=536&ey=402&align=center&resizesource&unsharp=1.5x1+0.7+0.02&cox=0&coy=0"
        ));
        productList.add(new Product(UUID.randomUUID(), "Nintendo Switch OLED",
                "The latest gaming console with an upgraded OLED display.",
                349.99,
                "https://scale.coolshop-cdn.com/product-media.coolshop-cdn.com/23MD8E/35cf84b9639e4e69ac49add1c5ec8101.jpg/f/nintendo-switch-oled-console-with-joy-con-black-white.jpg"
        ));
        productList.add(new Product(UUID.randomUUID(), "Bose SoundLink Flex",
                "Portable waterproof Bluetooth speaker with powerful sound.",
                149.00,
                "https://m.media-amazon.com/images/I/71eLvseXOmL.jpg"
        ));
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product addProduct(Product product) {
        product.setId(UUID.randomUUID());
        productList.add(product);
        return product;
    }

    public boolean deleteProduct(UUID id) {
        return productList.removeIf(product -> product.getId().equals(id));
    }
}
