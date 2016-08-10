# openmrs-module-dhis2reporter

### Generic Module requirements:
* Able to support multiple DHIS2 instances
* Integrated with DHIS2 WebAPI
* Able to Sync new changes (of datasets and organization units) in the Dhis2 Instance
* Support ADX

### Technical Workflow
* Acquiring Metadata from DHIS2
  * Datasets, dataelements, category options/combos/values, organization units
* Storing Values in OpenMRS
* Generating Values From OpenMRS
* Sending Data to DHIS2
  * ADX data


### Final Output(ADX Data):
```
<?xml version="1.0" encoding="UTF-8"?>
<adx xmlns="urn:ihe:qrph:adx:2015"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="urn:ihe:qrph:adx:2015 ../schema/adx_sample_generated.xsd"
     exported="2015-02-08T19:30:00Z">
    
    <group orgUnit="342" period="2015-01-01/P1M" dataSetComplete="true" mechanism="PEPFAR">
        <dataValue dataElement="MAL01" value="32" />
        <dataValue dataElement="MAL02" value="20" />
        <dataValue dataElement="MAL04" value="10" ageGroup="under5" sex="M" />
        <dataValue dataElement="MAL04" value="10" ageGroup="under5" sex="F"/>
        <dataValue dataElement="MAL04" value="10" ageGroup="5andOver" sex="M"/>
        <dataValue dataElement="MAL04" value="10" ageGroup="5andOver" sex="F"/>
    </group>
    <group orgUnit="342" period="2015-01-01/P1M" mechanism="OTHER" comment="Imported from facility system">
        <dataValue dataElement="MAL01" value="32" />
        <dataValue dataElement="MAL02" value="20" />
        <dataValue dataElement="MAL03" value="0" >
            <annotation>Some qualifying text here on the datavalue</annotation>
        </dataValue>
        <dataValue dataElement="MAL04" value="10" ageGroup="under5" sex="M" />
        <dataValue dataElement="MAL04" value="10" ageGroup="under5" sex="F"/>
        <dataValue dataElement="MAL04" value="10" ageGroup="5andOver" sex="M"/>
        <dataValue dataElement="MAL04" value="10" ageGroup="5andOver" sex="F"/>
    </group>
</adx>
```
