/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * To call Kamelets
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KameletEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Kamelet component.
     */
    public interface KameletEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedKameletEndpointConsumerBuilder advanced() {
            return (AdvancedKameletEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default KameletEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default KameletEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Kamelet component.
     */
    public interface AdvancedKameletEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default KameletEndpointConsumerBuilder basic() {
            return (KameletEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Location of the Kamelet to use which can be specified as a resource
         * from file system, classpath etc. The location cannot use wildcards,
         * and must refer to a file including extension, for example
         * file:/etc/foo-kamelet.xml.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param location the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointConsumerBuilder location(String location) {
            doSetProperty("location", location);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Kamelet component.
     */
    public interface KameletEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKameletEndpointProducerBuilder advanced() {
            return (AdvancedKameletEndpointProducerBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default KameletEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default KameletEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Kamelet component.
     */
    public interface AdvancedKameletEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default KameletEndpointProducerBuilder basic() {
            return (KameletEndpointProducerBuilder) this;
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer (advanced)
         * 
         * @param block the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointProducerBuilder block(boolean block) {
            doSetProperty("block", block);
            return this;
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer (advanced)
         * 
         * @param block the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointProducerBuilder block(String block) {
            doSetProperty("block", block);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a kamelet endpoint with no active consumers.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer (advanced)
         * 
         * @param failIfNoConsumers the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointProducerBuilder failIfNoConsumers(
                boolean failIfNoConsumers) {
            doSetProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a kamelet endpoint with no active consumers.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer (advanced)
         * 
         * @param failIfNoConsumers the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointProducerBuilder failIfNoConsumers(
                String failIfNoConsumers) {
            doSetProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * The timeout value to use if block is enabled.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: producer (advanced)
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointProducerBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The timeout value to use if block is enabled.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: producer (advanced)
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointProducerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Location of the Kamelet to use which can be specified as a resource
         * from file system, classpath etc. The location cannot use wildcards,
         * and must refer to a file including extension, for example
         * file:/etc/foo-kamelet.xml.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param location the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointProducerBuilder location(String location) {
            doSetProperty("location", location);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Kamelet component.
     */
    public interface KameletEndpointBuilder
            extends
                KameletEndpointConsumerBuilder,
                KameletEndpointProducerBuilder {
        default AdvancedKameletEndpointBuilder advanced() {
            return (AdvancedKameletEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Kamelet component.
     */
    public interface AdvancedKameletEndpointBuilder
            extends
                AdvancedKameletEndpointConsumerBuilder,
                AdvancedKameletEndpointProducerBuilder {
        default KameletEndpointBuilder basic() {
            return (KameletEndpointBuilder) this;
        }
        /**
         * Location of the Kamelet to use which can be specified as a resource
         * from file system, classpath etc. The location cannot use wildcards,
         * and must refer to a file including extension, for example
         * file:/etc/foo-kamelet.xml.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param location the value to set
         * @return the dsl builder
         */
        default AdvancedKameletEndpointBuilder location(String location) {
            doSetProperty("location", location);
            return this;
        }
    }

    public interface KameletBuilders {
        /**
         * Kamelet (camel-kamelet)
         * To call Kamelets
         * 
         * Category: core
         * Since: 3.8
         * Maven coordinates: org.apache.camel:camel-kamelet
         * 
         * Syntax: <code>kamelet:templateId/routeId</code>
         * 
         * Path parameter: templateId (required)
         * The Route Template ID
         * 
         * Path parameter: routeId
         * The Route ID. Default value notice: The ID will be auto-generated if
         * not provided
         * 
         * @param path templateId/routeId
         * @return the dsl builder
         */
        default KameletEndpointBuilder kamelet(String path) {
            return KameletEndpointBuilderFactory.endpointBuilder("kamelet", path);
        }
        /**
         * Kamelet (camel-kamelet)
         * To call Kamelets
         * 
         * Category: core
         * Since: 3.8
         * Maven coordinates: org.apache.camel:camel-kamelet
         * 
         * Syntax: <code>kamelet:templateId/routeId</code>
         * 
         * Path parameter: templateId (required)
         * The Route Template ID
         * 
         * Path parameter: routeId
         * The Route ID. Default value notice: The ID will be auto-generated if
         * not provided
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path templateId/routeId
         * @return the dsl builder
         */
        default KameletEndpointBuilder kamelet(String componentName, String path) {
            return KameletEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static KameletEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class KameletEndpointBuilderImpl extends AbstractEndpointBuilder implements KameletEndpointBuilder, AdvancedKameletEndpointBuilder {
            public KameletEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new KameletEndpointBuilderImpl(path);
    }
}