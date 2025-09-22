# Assignment 1 — Design Patterns (Abstract Factory + Factory Method)

**Group 41:** Aliza Rizwan, Inshal Chaudhary, Zainab Lawal
**IDE:** IntelliJ IDEA (Maven project)

This project implements:

- **Abstract Factory** — `SmartDeviceFactory` creates a family of products (Bulb, Lock) for a brand via `BrandAFactory` and `BrandBFactory`.
- **Factory Method** — each product defers usage-data loading via `createUsageLoader()` (implemented by concrete products), which returns a `UsageLoader` (here, `FileUsageLoader`) to read values from tiny text files (simulating an external DB).

## Repository Structure
design-patterns-assignment-min/
├─ pom.xml
├─ README.md
├─ docs/
│  ├─ uml.txt
│  └─ uml.plantuml
└─ src/
├─ main/java/com/aliza/smart/
│  ├─ api/              # Interfaces
│  │   ├─ Bulb.java
│  │   ├─ Lock.java
│  │   └─ SmartDeviceFactory.java
│  ├─ devices/          # Abstract + concrete products
│  │   ├─ AbstractSmartDevice.java
│  │   ├─ BrandABulb.java
│  │   ├─ BrandALock.java
│  │   ├─ BrandBBulb.java
│  │   └─ BrandBLock.java
│  ├─ factories/
│  │   ├─ BrandAFactory.java
│  │   └─ BrandBFactory.java
│  ├─ usage/
│  │   ├─ UsageLoader.java
│  │   └─ FileUsageLoader.java
│  └─ app/
│      └─ Main.java
├─ main/resources/usage/
│  ├─ brandA/
│  │   ├─ bulb.txt   (9.5)
│  │   └─ lock.txt   (0.15)
│  └─ brandB/
│      ├─ bulb.txt   (8.8)
│      └─ lock.txt   (0.20)
└─ test/java/com/aliza/smart/
└─ BulbLockTests.java

## How to Run (IntelliJ)
1. Open **File → New → Project from Existing Sources…**, choose `pom.xml`.
2. Wait for Maven sync.
3. Run demo: open `Main.java` → ▶.
4. Run tests: right-click `test/java/com/aliza/smart` → **Run ‘Tests…’**.

## Demo Output
- **Brand A Bulb** loads watts from `usage/brandA/bulb.txt`.
- **Brand B Lock** loads %/day from `usage/brandB/lock.txt`.

## Tests
- `loadsUsageForBrandABulb()` → expects `9.5`.
- `loadsUsageForBrandBLock()` → expects `0.20`.
- `factoriesCreateCorrectConcreteTypes()` → sanity check.

  ## Screenshots (add after running)
- `docs/screenshots/main-output.png` - please check this folder 
- `docs/screenshots/tests-pass.png` - please check this folder
- `docs/screenshots/uml.png` - please check this folder
