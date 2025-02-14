/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

description = "This module contains support for converting Smithy resources to CloudFormation Resource Schemas."

extra["displayName"] = "Smithy :: Cloudformation Conversion"
extra["moduleName"] = "software.amazon.smithy.cloudformation.converter"

// Necessary to load the everit JSON Schema validator.
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    api(project(":smithy-build"))
    api(project(":smithy-jsonschema"))
    api(project(":smithy-aws-cloudformation-traits"))
    api(project(":smithy-aws-iam-traits"))
    api(project(":smithy-aws-traits"))

    // For use in validating schemas used in tests against the supplied
    // CloudFormation definition schema.
    testImplementation("com.github.everit-org.json-schema:org.everit.json.schema:1.12.1")
}
