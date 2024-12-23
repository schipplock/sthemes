# SThemes

SThemes ist eine Java Bibliothek, welche verschiedene Themes für das Java Look & Feel (Metal (DefaultMetalTheme)) bereitstellt.
SThemes steht für `Steel Themes`. Steel, weil `DefaultMetalTheme` den Namen `Steel` trägt.
Lustigerweise ist `DefaultMetalTheme` nicht das Standardtheme des Metal Look & Feels, war es aber mal. Jetzt ist es `Ocean`.
Mir persönlich gefällt das `Steel` Metaltheme aber deutlich besser.

## Screenshots

![](screenshots/banner.png)

## Installation

**Das muss in die pom.xml:**

```xml
<dependency>
    <groupId>de.schipplock.gui.swing</groupId>
    <artifactId>sthemes</artifactId>
    <version>0.0.6</version>
</dependency>
```

## Wie verwende ich diese Bibliothek?

**Es wird folgender Import benötigt (je nachdem, welches Theme man nutzen möchte):**

```java
import de.schipplock.gui.swing.sthemes.MedicTheme;
import de.schipplock.gui.swing.sthemes.BlindedTheme;
import de.schipplock.gui.swing.sthemes.OceanTheme;
import de.schipplock.gui.swing.sthemes.SteelTheme;
```

**Das Theme ändern:**

```java
MetalLookAndFeel.setCurrentTheme(new SteelTheme());
UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
```

## License
[Apache License 2.0](https://choosealicense.com/licenses/apache-2.0/)