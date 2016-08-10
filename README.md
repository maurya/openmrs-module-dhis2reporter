<img src="https://s3-eu-west-1.amazonaws.com/jembi/images/OMRSsig1.jpg" alt="OpenMRS"/>
# openmrs-module-dhis2reporter

### Module requirements:
* Able to support multiple DHIS2 instances
* Integrated with DHIS2 WebAPI
* Able to Sync new changes (of datasets and organization units) in the Dhis2 Instance
* Support [ADX](http://wiki.ihe.net/index.php/Aggregate_Data_Exchange)

## DHIS2 Model

<img src="https://github.com/maurya/openmrs-module-dhis2reporter/blob/master/omod/src/main/resources/images/dhis2core_diagram.jpg" alt="DHIS2 Model"/>

## Module Model

* DHIS2 Server - id, url, username, password
* DataSet - id, dhis2server, uid, name, code, period
* OrgUnit - id, dhis2server, uid, name, code, Location
* DataElement - id, dhis2server, uid, name, code
* Disaggregation - id, name, uid, dhis2server
* DataValueTemplate - id, DataSet, DataElement, Disaggregation

## Technical Workflow
###Acquiring Metadata from DHIS2
 Datasets, dataelements, category options/combos/values, organization units
###Storing Values in OpenMRS
###Generating Values From OpenMRS
Generate Aggregate values for the dataset, for all the orgunits selected 
###Sending Data to DHIS2
#### ADX data
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

## License
[MPL 2.0 w/ HD](http://openmrs.org/license/) © [OpenMRS Inc.](http://www.openmrs.org/)
