# SThemes

SThemes ist eine Java Bibliothek, welche verschiedene Themes für das Java Look & Feel (Metal (DefaultMetalTheme)) bereitstellt.
SThemes steht für `Steel Themes`. Steel, weil `DefaultMetalTheme` den Namen `Steel` trägt.
Lustigerweise ist `DefaultMetalTheme` nicht das Standardtheme des Metal Look & Feels, war es aber mal. Jetzt ist es `Ocean`.
Mir persönlich gefällt das `Steel` Metaltheme aber deutlich besser.
Diese Bibliothek wurde mit Java 17 getestet.

## Screenshots

![](screenshots/banner.png)

## Installation

Diese Bibliothek wird nicht auf Maven-Central veröffentlicht.
Um diese Bibliothek verwenden zu können, muss ein alternatives Maven-Repository genutzt werden.
Man kann die *.jar aber auch direkt von Nexus3
[runterladen](https://nexus.symbolv.de/#browse/browse:maven:de%2Fsymbolv%2Fsthemes%2Fsthemes),
wenn man das alternative Maven-Repository nicht nutzen möchte.

**Das muss in die pom.xml:**

```xml
<project>
    <repositories>
        <repository>
            <id>nexus.symbolv.de</id>
            <name>SymbolV Nexus Repository</name>
            <url>https://nexus.symbolv.de/repository/maven/</url>
            <layout>default</layout>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>de.symbolv.sthemes</groupId>
            <artifactId>sthemes</artifactId>
            <version>0.0.1</version>
        </dependency>
    </dependencies>
</project>
```

## Wie verwende ich diese Bibliothek?

**Es wird folgender Import benötigt (je nachdem, welches Theme man nutzen möchte):**

```java
import de.schipplock.gui.MedicTheme;
import de.schipplock.gui.BlindedTheme;
import de.schipplock.gui.OceanTheme;
import de.schipplock.gui.SteelTheme;
```

**Das Theme ändern:**

```java
MetalLookAndFeel.setCurrentTheme(new SteelTheme());
UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
```

## License
[Apache License 2.0](https://choosealicense.com/licenses/apache-2.0/)