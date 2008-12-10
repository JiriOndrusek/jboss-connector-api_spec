/*
* JBoss, Home of Professional Open Source
* Copyright 2008, JBoss Inc., and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/

package javax.resource.spi;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Designates a JavaBean property as a configuration property
 * 
 * @since 1.6
 * @version JSR322-PublicReview
 */

@Documented
@Retention(RUNTIME)
@Target( { FIELD, METHOD })
public @interface ConfigProperty {

	/**
	 * Inferred by the container if unspecified.
	 */
	Class type() default Object.class;

	String description() default "";

	/**
	 * Inferred by the container for field based annotations if possible
	 */
	String defaultValue() default "";

	/**
	 * Indicates that the configuration tools must ignore considering this
	 * Property during auto-discovery of Configuration properties.
	 */
	boolean ignore() default false;
}